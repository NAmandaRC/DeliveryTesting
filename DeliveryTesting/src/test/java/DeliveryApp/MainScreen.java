package DeliveryApp;

import control.Button;
import org.openqa.selenium.By;

public class MainScreen {
    public Button RegisterLogIn = new Button(By.xpath(" //android.widget.Button"));

    public Button RecoverAccount = new Button(By.xpath("//android.widget.TextView[@text=\"Recupera tu cuenta\"]"));
    public Button AnotherOption= new Button(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"));



    public Button RestaurantOption=new Button (By.xpath("//android.widget.TextView[@text=\"Restaurantes\"]"));
    public Button CafeOption=new Button (By.xpath("//android.widget.TextView[@text=\"Cafés y postres\"]"));
    public Button LiquorStoreOption=new Button (By.xpath("//android.widget.TextView[@text=\"Licorerías\"]"));
    public Button FoodCourtOption=new Button (By.xpath("//android.widget.TextView[@text=\"Plaza de comidas\"]"));

    public Button MainScreenButton=new Button(By.xpath("//android.widget.TextView[@text=\"Inicio\"]"));

    /*
    public TextBox RestaurantOption = new TextBox(By.xpath("//android.widget.TextView[matches(@text, '[Rr][Ee][Ss][Tt][Aa][Uu][Rr][Aa][Nn][Tt][Ee][Ss]')]"));
    public Button CafeOption = new Button(By.xpath("//android.widget.TextView[matches(@text, '[Cc][Aa][FfÉé][Ss] [Yy] [Pp][Oo][Ss][Tt][Rr][Ee][Ss]')]"));
    public Button LiquorStoreOption = new Button(By.xpath("//android.widget.TextView[matches(@text, '[Ll][Ii][Cc][Oo][Rr][Ee][Rrí][Aa][Ss]')]"));
    public Button FoodCourtOption = new Button(By.xpath("//android.widget.TextView[matches(@text, '[Pp][Ll][Aa][Zz][Aa] [Dd][Ee] [Cc][Oo][Mm][Ii][Dd][Aa][Ss]')]"));
*/




}
