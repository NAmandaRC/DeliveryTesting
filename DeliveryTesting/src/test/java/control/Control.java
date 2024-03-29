package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class Control {

    protected By locator;
    protected WebElement control;

    public Control(By locator){
        this.locator = locator;
    }

    public void findControl(){
        this.control = Session.getSessionInstance().getDevice().findElement(this.locator);
    }

    public void click(){
        findControl();
        control.click();
    }

    public String getText(){
        findControl();
        return control.getText();
    }

    public By isControlDisplayed(){
        try{
            findControl();
            return control.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public String getContentDescription(){
        findControl();
        return control.getAttribute("content-desc");
    }

}