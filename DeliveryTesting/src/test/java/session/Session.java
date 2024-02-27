package session;

import factoryDevice.Android;
import factoryDevice.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import util.GetProperties;

public class Session {

    private static Session session = null;
    private AppiumDriver device;
    private boolean sessionActive;
    Android androidDevice = new Android();
    private Session() {
        device = FactoryDevice.make(GetProperties.getProperties().getDevice()).create();
        sessionActive = true;
    }

    public static Session getSessionInstance() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public void closeSession() {
        sessionActive = false;
        device.quit();
        session = null;
    }

    public AppiumDriver getDevice() {
        return device;
    }

    public void resetSession() {
        if (device != null) {
            try {
                device.quit();
            } catch (Exception ex) {
                System.err.println("Error al cerrar la sesión del driver: " + ex.getMessage());
            }
        }
        device = androidDevice.create();
    }

    public boolean isSessionActive() {
        try {
            device.getTitle(); // Realiza una acción para verificar si la sesión está activa
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void performActionSafely(Runnable action) {
        if (isSessionActive()) {
            action.run();
        } else {
            // Reiniciar la sesión si ha expirado
            closeSession();
            session = new Session();
        }
    }


}
