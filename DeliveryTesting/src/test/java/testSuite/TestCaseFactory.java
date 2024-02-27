package testSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.NoSuchSessionException;
import testSuite.steps.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestCaseFactory {
    static ExtentReports extentReports = new ExtentReports();
    static ExtentTest test;

    @BeforeAll
    public static void setUp() {
        ExtentSparkReporter spark = new ExtentSparkReporter("D:\\Reports\\test_report.html");
        extentReports.attachReporter(spark);
    }


    @Test
    @DisplayName("Ejecutar TestCase1")
    public void testCase1() {
        test = extentReports.createTest("Ejecutar TestCase1");
        try {
            LoginStep loginstep = new LoginStep();
            CategorySelectionStep categorySelectionStep = new CategorySelectionStep();
            AddressRegisterStep addressRegisterStep = new AddressRegisterStep();
            FoodSearchStep foodSearchStep = new FoodSearchStep();
            OrderPlacement orderPlacement = new OrderPlacement();

            loginstep.testExecute();
            //addressRegisterStep.testExecute();
            categorySelectionStep.pressRestaurant();
            foodSearchStep.testExecute();
           // orderPlacement.testExecute();

            test.pass("TestCase1 se ejecutó correctamente");
           // testCase2();
        } catch (NoSuchSessionException e) {
            test.fail("Error: La sesión de la aplicación no está disponible. Reiniciando la sesión...");
            // Agregar código para reiniciar la sesión o manejar el error de manera adecuada
        } catch (Exception e) {
            handleException(e);
            test.fail("Error durante la ejecución de TestCase1");
        }
    }
/*
    @Test
    @DisplayName("Ejecutar TestCase2")
    public void testCase2() {
        test = extentReports.createTest("Ejecutar TestCase2");
        try {
            CategorySelectionStep categorySelectionStep = new CategorySelectionStep();
            AddressRegisterStep addressRegisterStep = new AddressRegisterStep();
            FoodSearchStep foodSearchStep = new FoodSearchStep();
            OrderPlacement orderPlacement = new OrderPlacement();

            categorySelectionStep.pressMainScreen();
            //addressRegisterStep.testExecute();
            categorySelectionStep.pressCafe();
            foodSearchStep.testExecute();
            // orderPlacement.testExecute();
            test.pass("TestCase1 se ejecutó correctamente");
            testCase3();
        } catch (NoSuchSessionException e) {
            test.fail("Error: La sesión de la aplicación no está disponible. Reiniciando la sesión...");
            // Agregar código para reiniciar la sesión o manejar el error de manera adecuada
        } catch (Exception e) {
            handleException(e);
            test.fail("Error durante la ejecución de TestCase1");
        }
    }
    @Test

    @DisplayName("Ejecutar TestCase3")
    public void testCase3() {
        test = extentReports.createTest("Ejecutar TestCase3");
        try {
            LoginStep loginstep = new LoginStep();
            CategorySelectionStep categorySelectionStep = new CategorySelectionStep();
            AddressRegisterStep addressRegisterStep = new AddressRegisterStep();
            FoodSearchStep foodSearchStep = new FoodSearchStep();
            OrderPlacement orderPlacement = new OrderPlacement();

            categorySelectionStep.pressMainScreen();
            //addressRegisterStep.testExecute();
            categorySelectionStep.pressFoodCourt();
            //foodSearchStep.testExecute();
            // orderPlacement.testExecute();
            testCase4();
            test.pass("TestCase1 se ejecutó correctamente");
        } catch (NoSuchSessionException e) {
            test.fail("Error: La sesión de la aplicación no está disponible. Reiniciando la sesión...");
            // Agregar código para reiniciar la sesión o manejar el error de manera adecuada
        } catch (Exception e) {
            handleException(e);
            test.fail("Error durante la ejecución de TestCase1");
        }
    }

    @Test
    @DisplayName("Ejecutar TestCase4")
    public void testCase4() {
        test = extentReports.createTest("Ejecutar TestCase4");
        try {
            LoginStep loginstep = new LoginStep();
            CategorySelectionStep categorySelectionStep = new CategorySelectionStep();
            AddressRegisterStep addressRegisterStep = new AddressRegisterStep();
            FoodSearchStep foodSearchStep = new FoodSearchStep();
            OrderPlacement orderPlacement = new OrderPlacement();

            categorySelectionStep.pressMainScreen();
            //addressRegisterStep.testExecute();
            categorySelectionStep.pressLiquorStore();
            foodSearchStep.testExecute();
            // orderPlacement.testExecute();
            test.pass("TestCase1 se ejecutó correctamente");
        } catch (NoSuchSessionException e) {
            test.fail("Error: La sesión de la aplicación no está disponible. Reiniciando la sesión...");
            // Agregar código para reiniciar la sesión o manejar el error de manera adecuada
        } catch (Exception e) {
            handleException(e);
            test.fail("Error durante la ejecución de TestCase1");
        }
    }*/
    @AfterAll
    public static void tearDown() {
        extentReports.flush();
    }

    private static void handleException(Exception e) {

        Logger.getLogger(TestCaseFactory.class.getName()).log(Level.SEVERE, "Error durante la ejecución de TestCase1", e);
    }
}
