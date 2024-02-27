package testSuite.steps;

import DeliveryApp.Location;
import DeliveryApp.Login;
import DeliveryApp.MainScreen;
import DeliveryApp.Permissions;
import org.junit.jupiter.api.Test;

public class LoginStep  {
    MainScreen mainScreen=new MainScreen();
    Permissions permissions=new Permissions();
    Login login=new Login();
    Location location=new Location();

@Test
    public void testExecute() {

        permissions.AppInUse.click();
        permissions.AllowMultimedia.click();

        /*permissions.AproxLocation.click();
        permissions.AppInUse.click();
        permissions.AllowMultimedia.click();
        permissions.ContinueAproxLocation.click();*/

        //String email="testing.app.delivery@hotmail.com";
        String email="testing.app.delivery2@outlook.es";
        String password="Test-123!";

        mainScreen.RegisterLogIn.click();
        mainScreen.RecoverAccount.click();
        mainScreen.AnotherOption.click();
        login.email.setText(email);
        login.password.setText(password);
        login.loginButton.click();
        //location.NextButton.click();
    }
}
