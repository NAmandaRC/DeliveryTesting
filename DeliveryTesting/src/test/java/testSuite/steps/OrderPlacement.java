package testSuite.steps;

import DeliveryApp.Product;
import DeliveryApp.SearchFood;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import session.Session;

public class OrderPlacement {
    Product product = new Product();
    SearchFood searchFood=new SearchFood();



    public static boolean containsValue(String text, String valueToCheck) {
        if (text != null && !text.isEmpty() && valueToCheck != null && !valueToCheck.isEmpty()) {
            return text.contains(valueToCheck);
        } else {
            throw new IllegalArgumentException("El texto y el valor a verificar no pueden ser nulos o vacíos.");
        }
    }


    public static boolean isGreaterThanOrEqualTo(String text, int valueToCheck) {

        try {
            int intValue = Integer.parseInt(text);
            return intValue >= valueToCheck;
        } catch (NumberFormatException e) {

            return false;
        }
    }

    public boolean isButtonPresent(By locator) {
        try {
            Session.getSessionInstance().getDevice().findElement(locator);
            return true; // Se encontró el botón
        } catch (NoSuchElementException e) {
            return false; // No se encontró el botón
        }
    }


}
