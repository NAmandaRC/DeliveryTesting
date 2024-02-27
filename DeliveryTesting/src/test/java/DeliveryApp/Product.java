package DeliveryApp;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class Product {
    public TextBox order=new TextBox(By.xpath("//android.widget.TextView[@text=\"%s\"]"));
    public Button ClickButton=new Button(By.xpath("//android.widget.Button"));
    public Button EmptyOrder=new Button(By.xpath("//android.widget.TextView[@text=\"Vaciar pedido\"]"));

    public Button ReturnButton=new Button(By.xpath("//android.widget.TextView[@text=\"\uDB80\uDC4D\"]"));
    public TextBox Cart=new TextBox(By.id("00000000-0000-04a6-ffff-ffff000007a4"));
    public Button AdicionalButton=new Button(By.xpath("(//android.widget.TextView[@text=\"\uF067\"])"));


}
