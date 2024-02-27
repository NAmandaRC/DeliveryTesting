package testSuite.steps;

import DeliveryApp.Location;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class AddressRegisterStep  {
    Location location=new Location();
    @Test
    public void testExecute() throws InterruptedException {
        String[] streets = {"Av. Arce", "Calle 7", "Av. Busch", "Av. 16 de Julio", "Av. Hernando Siles"};
        Random random = new Random();
        String street = streets[random.nextInt(streets.length)];
        int number = random.nextInt(10000) + 1;
        String direction = street + " " + number + ", La Paz";
        //location.Casa.click();
        //location.Address.setText(direction);
        Thread.sleep(15000);
        location.SaveAddress.click();
        //location.AdressList.click();
    }




}

