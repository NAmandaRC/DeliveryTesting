package control;

import org.openqa.selenium.By;
import session.Session;

public class Button extends Control{
    public Button(By locator) {  super(locator); }
    public String getBottomButtonValue(){
       findControl();
       String buttonText=control.getText();
       return buttonText;
    }
    public void findControl(){
        this.control = Session.getSessionInstance().getDevice().findElement(this.locator);
    }

}
