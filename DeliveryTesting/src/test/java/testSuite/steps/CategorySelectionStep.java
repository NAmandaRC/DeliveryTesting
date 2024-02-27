package testSuite.steps;

import DeliveryApp.MainScreen;

public class CategorySelectionStep {
    MainScreen mainScreen=new MainScreen();
    public void pressRestaurant() throws InterruptedException {
        Thread.sleep(8000);
       mainScreen.RestaurantOption.click();
    }

    public void pressCafe() throws InterruptedException {
    Thread.sleep(8000);
    mainScreen.CafeOption.click();
    }

    public void pressLiquorStore() throws InterruptedException {
        Thread.sleep(8000);
        mainScreen.LiquorStoreOption.click();
    }

    public void pressFoodCourt() throws InterruptedException {
        Thread.sleep(8000);
        mainScreen.FoodCourtOption.click();
    }

    public void pressMainScreen() throws InterruptedException {
        Thread.sleep(8000);
        mainScreen.MainScreenButton.click();}

}
