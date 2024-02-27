package testSuite.steps;

import DeliveryApp.Location;
import DeliveryApp.Product;
import DeliveryApp.SearchFood;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class FoodSearchStep {
    SearchFood searchFood=new SearchFood();
    Location location=new Location();
    Product product=new Product();
    OrderPlacement orderPlacement=new OrderPlacement();
    public String foodType;
@Test
    public void testExecute() throws InterruptedException {
    //Thread.sleep(18000);
    //location.AdressList.click();
    Thread.sleep(18000);
    searchFood.SearchIcon.click();
    Thread.sleep(18000);
    foodType = generateRandomFood();
    searchFood.SearchBar.setText(foodType);
    searchFood.ScrollRestaurant.swipe();
    Thread.sleep(8000);
    searchFood.ScrollRestaurant.clickCenter();
    Thread.sleep(8000);
    searchFood.ScrollRestaurant.swipe();
    Thread.sleep(8000);
    searchFood.ScrollRestaurant.clickCenter();
    Thread.sleep(8000);

}

    public String generateRandomFood() {
        String[] foods = {"Pizza", "Hamburguesa",  "Tucumana", "Pollo", "Saltena",  "Parrilla"};
        Random random = new Random();
        int randomIndex = random.nextInt(foods.length);
        return foods[randomIndex];
    }

}
