package DeliveryApp;

import control.Button;
import control.Label;
import control.Scroll;
import control.TextBox;
import org.openqa.selenium.By;

public class
SearchFood {
    public Button Restaurant=new Button(By.xpath("//android.widget.TextView[@text=\"Restaurantes\"]"));
    public Button SearchIcon=new Button(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.Button"));
    public TextBox SearchBar=new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"RNE__Input__text-input\"]"));
    public Label FoodName=new Label(By.xpath("//android.widget.TextView[@text=\"%s\"]"));
    public Scroll ScrollRestaurant=new Scroll(By.xpath("//android.widget.ScrollView/android.view.ViewGroup"));



}
