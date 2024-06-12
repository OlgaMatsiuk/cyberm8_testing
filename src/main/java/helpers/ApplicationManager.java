package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public interface ApplicationManager {

    WebDriver wd = new ChromeDriver();

    default void init(){

        System.out.println("Dont App men init");

         wd.navigate().to("https://testing.cloud.cyberm8.com/");
       // wd.navigate().to("https://phonebook.lbl.gov/");

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }





}
