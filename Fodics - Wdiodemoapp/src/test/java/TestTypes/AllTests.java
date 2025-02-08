package TestTypes;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Base;
import Screens.FormsPageTest;
import Screens.LoginPageTest;
import Screens.SwiprPageTest;

public class AllTests extends Base {

    LoginPageTest LoginPage = new LoginPageTest();
    FormsPageTest FormsPage = new FormsPageTest(); 
    SwiprPageTest SwipePage = new SwiprPageTest(); 


    @Test
    (priority = 1 , enabled = true )
    public void NavigateLogin(){

        LoginPage.NavigateLoginPage();

    }

    @Test
    (priority = 2 , enabled = true )
    public void SelectSignUp(){

        LoginPage.SelectSignUp();

    }
 
    @Test
    (priority = 3 , enabled = true )
    public void FillSignUpFields() throws IOException{

        LoginPage.FillSignUpFields();

    }
 
    @Test
    (priority = 4 , enabled = true )
    public void VerifySignUp(){

        LoginPage.VerifySignUp();

    }

    @Test
    (priority = 5 , enabled = true )
    public void NavigateLoginTap(){

        LoginPage.NavigateLoginTap();

    }

    @Test
    (priority = 6 , enabled = true )
    public void FillLoginFields() throws IOException{

        LoginPage.FillLoginFields();

    }

    @Test
    (priority = 7 , enabled = true )
    public void VerifyLogin(){

        LoginPage.VerifyLogin();

    }

    @Test
    (priority = 8 , enabled = true )
    public void NavigateFormsPage(){

        FormsPage.NavigateFormsPage();

    }

    @Test
    (priority = 9 , enabled = true )
    public void FillFormFields(){

        FormsPage.FillFormFields();

    }

    @Test
    (priority = 10 , enabled = true )
    public void NavigateSwipePage() throws InterruptedException{

        SwipePage.NavigateSwipePage();

    }
    
}
