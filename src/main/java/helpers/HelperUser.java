package helpers;

import models.UserDTO;
import org.openqa.selenium.By;

public interface HelperUser extends HelperBase{

//    default void selectItemForms(){
//        if(!isElementPresent(By.xpath("//form[@class='ng-untouched ng-dirty ng-valid']"))) {
//
//        }
//        //click(By.xpath("//div[@class='category-cards']/div[2]"));
//    }

default void fillLoginForm(UserDTO user) {
    type(By.id("username"), user.getUsername());
    type(By.id("password"), user.getPassword());
}

default void clickLoginButton(){
    click(By.id("loginBtn"));
}

}
