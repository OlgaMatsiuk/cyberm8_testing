package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface HelperBase extends ApplicationManager{
    //WebDriver wd;

    default void type(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    default void click(By locator){
        wd.findElement(locator).click();
    }
    default boolean isElementPresent(By locator){
        return wd.findElements(locator).size() > 0;
    }


}
