
package testSuite;

import DeliveryApp.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import factoryDevice.Android;
import io.appium.java_client.AppiumDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;
import testSuite.steps.LoginStep;

import java.time.Duration;
import java.util.Random;


public class Prueba {
    LoginStep loginstep=new LoginStep();
    MainScreen mainScreen=new MainScreen();
    Permissions permissions=new Permissions();
    Login login=new Login();
    Location location=new Location();
    Product product=new Product();
    SearchFood searchFood=new SearchFood();
    WebDriverWait wait;
/*    private ExtentReports extent;
    private ExtentTest test;*/
/*    public PerformsTouchActions driver;
    TouchAction touchAction = new TouchAction(driver);
    Scroll scroll=new Scroll(touchAction);*/
/*
    @BeforeMethod
    public void setup() {
        // Configuración del informe Extent
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("build/reports/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }*/
static ExtentReports extentReports= new ExtentReports();

@BeforeAll
public static void setUp() {
    ExtentSparkReporter spark = new ExtentSparkReporter("D:\\Reports\\test_report.html");
    extentReports.attachReporter(spark);

}

    @Test
    public void openApp() throws InterruptedException {
        /*
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("build/reports/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);*/

        Android androidDevice = new Android();
        AppiumDriver driver = androidDevice.create();
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        try {
            //permission();
            //login();
            //address();
            //FoodOrder();
            loginstep.testExecute();
        } catch (Exception e) {
            e.printStackTrace();
            // Puedes agregar un bloque para cerrar la sesión aquí si es necesario
        } finally {
            // Cerrar la sesión incluso si hay excepciones
            Session.getSessionInstance().closeSession();
        }
    }

    @AfterEach
    public void closeApp(){
        Session.getSessionInstance().closeSession();
    }

    public void permission(){
        permissions.AproxLocation.click();
        permissions.AppInUse.click();
        permissions.AllowMultimedia.click();
        permissions.ContinueAproxLocation.click();

    }
    public void login(){
        //String email="testing.app.delivery@hotmail.com";
        String email="testing.app.delivery2@outlook.es";
        String password="Test-123!";

        mainScreen.RegisterLogIn.click();
        mainScreen.RecoverAccount.click();
        mainScreen.AnotherOption.click();
        login.email.setText(email);
        login.password.setText(password);
        login.loginButton.click();
    }
    public void address() throws InterruptedException {
        location.NextButton.click();
        String[] streets = {"Av. Arce", "Calle 7", "Av. Busch", "Av. 16 de Julio", "Av. Hernando Siles"};
        Random random = new Random();
        String street = streets[random.nextInt(streets.length)];
        int number = random.nextInt(10000) + 1;
        String direction = street + " " + number + ", La Paz";

        //location.Address.setTextEnter(direction);
        location.SaveAddress.click();


        /*String direction="Av. Arce 2355, La Paz";
        //location.Address.clear();
        location.NextButton.click();
        location.Address.setTextEnter(direction);
        location.SaveAddress.click();*/
    }
    public void FoodOrder(){
        mainScreen.RestaurantOption.click();
        String food = generateRandomFood();
        searchFood.SearchIcon.click();
        searchFood.SearchBar.setTextEnter(food);
       // scroll.scrollDown();
        searchFood.FoodName.click();
        //
        // scroll.scrollDown();
        product.ClickButton.click();

        /*
        //SEARCH RESTAURANT
        String food="Sillpichs";
        String pickfood="Sillpichs - Sopocachi";
        searchFood.Restaurant.click();
        searchFood.SearchIcon.click();
        searchFood.SearchBar.setTextEnter(food);

        Label foodLabel = new Label(By.xpath(String.format(searchFood.FoodName.getText(), pickfood)));
        foodLabel.click();

        //PICK FOOD
        String FoodPlate="Sopa de pollo";
        Label FoodPlateName = new Label(By.xpath(String.format(product.order.getText(), FoodPlate)));
        FoodPlateName.click();
        product.ClickButton.click();*/
    }
    public String generateRandomFood() {
        String[] foods = {"Pizza", "Hamburguesa", "Sushi", "Ensalada", "Tacos", "Pasta", "Sándwich", "Burrito", "Parrillada"};
        Random random = new Random();
        int randomIndex = random.nextInt(foods.length);
        return foods[randomIndex];
    }

}

