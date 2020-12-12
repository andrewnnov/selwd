package testngtutorial.test;

import org.testng.annotations.*;

public class Day3 {



    @Test(groups = {"Smoke"})
    public void webLogin() {
        //Selenium
        System.out.println("web");
    }


    @Test(dataProvider = "getData")
    public void mobileLogin(String userName, String pass) {
        //Apium
        System.out.println("mobile");
        System.out.println(userName);
        System.out.println(pass);
    }

    @Parameters({"URL", "APIKey/userName"})
    @Test
    public void mobileSearch(String urlName, String key) {
        //Apium
        System.out.println("mobileSearch");
        System.out.println(urlName);
        System.out.println(key);
    }

    @Test(enabled = false)
    public void mobileChrome() {
        //Apium
        System.out.println("mobileChrome");
    }

    @Test(dependsOnMethods = {"mobileLogin"})
    public void loginAPI() {
        //rest API
        System.out.println("API");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("I am number one");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am number one last");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After executing all method in the class Day3");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method before day 3 class");
    }

    @BeforeMethod
    public void afterMethod() {
        System.out.println("after method before day 3 class");
    }

    @DataProvider
    public Object[][] getData() {

        //1st combination username password -good credit history
        //2nd combination username password -no credit history
        //3td fraudelent credit history
        Object[][] data = new Object[3][2];
        data[0][0] = "firstusername";
        data[0][1] = "password";

        //2nd set
        data[1][0] = "secondusername";
        data[1][1] = "secondpassword";

        //3
        data[2][0] = "3username";
        data[2][1] = "3password";

        return data;

    }






}
