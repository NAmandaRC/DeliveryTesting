package DeliveryApp;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class Location {

    public Button NextButton=new Button(By.xpath("//android.widget.TextView[@text=\"SIGUIENTE\"]"));

    public Button SaveAddress=new Button(By.xpath("//android.widget.TextView[matches(@text, '[Gg][Uu][Aa][Rr][Dd][Aa][Rr] [Dd][Ii][Rr][Ee][Cc][Cc][IiÓóNn]')]"));
  //  public TextBox Address=new TextBox(By.xpath("//android.widget.EditText[@text=\"Dirección\"]"));
      public TextBox Address=new TextBox(By.xpath("//android.widget.EditText[matches(@text, '[Dd][Ii][Rr][Ee][Cc][Cc][IiÓóNn]')]"));
      public Button Casa=new Button(By.xpath("//android.widget.TextView[@text=\"CASA\"]"));
      public Button Trabajo=new Button(By.xpath("//android.widget.TextView[@text=\"TRABAJO\"]"));

      public Button AdressList=new Button(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));

}

