package e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class WaiterImpAndExp {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait ww = new WebDriverWait(driver, 5); //-explicit wait
        driver.manage().window().maximize();

        String [] arrayOfVegetAndFruit = {"Brocolli", "Cauliflower", "Beetroot", "Cucumber"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        addItems(driver, arrayOfVegetAndFruit);

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='cart-preview active']//button[text()='PROCEED TO CHECKOUT']")).click();
        ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']"))); //-explicit wait
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        //explicit wait

        ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']"))); //-explicit wait
        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());


    }

    public static void addItems(WebDriver driver, String [] arrayOfVegetAndFruit) {
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

        for (int i = 0; i < products.size(); i++) {
            //formatting string
            String[] name = products.get(i).getText().split("-");
            String formattingName = name[0].trim();
            //convert array into arrayList for easy search ??? strange
            List listOfChoose = Arrays.asList(arrayOfVegetAndFruit);
            int j = 0;
            if(listOfChoose.contains(formattingName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(j==arrayOfVegetAndFruit.length) {
                    break;
                }
            }
        }
    }
}
