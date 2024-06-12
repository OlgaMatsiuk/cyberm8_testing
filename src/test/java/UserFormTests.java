import helpers.HelperUser;
import models.UserDTO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserFormTests extends TestBase implements HelperUser {

    @BeforeMethod
    public void precondition(){
       // isElementPresent()

       // selectItemForms();

    }

    @Test
    public void userFormPositive(){
        UserDTO user = UserDTO.builder()
                .username("admin")
                .password("REZ1ucp2drw8gdp@efj")

                .build();

        fillLoginForm(user);
        clickLoginButton();

    }

}
