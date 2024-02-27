package DeliveryApp;

import control.Button;

import control.TextBox;
import org.openqa.selenium.By;

public class Login {
    public TextBox email = new TextBox(By.xpath("(//android.widget.EditText[@resource-id=\"RNE__Input__text-input\"])[1]"));
    public TextBox password=new TextBox(By.xpath("(//android.widget.EditText[@resource-id=\"RNE__Input__text-input\"])[2]"));
    public Button loginButton=new Button(By.xpath("//android.widget.TextView[@text=\"INGRESA\"]"));
    public Button NotSaveCredentials=new Button(By.id("android:id/sem_autofill_save_no_second"));


}
