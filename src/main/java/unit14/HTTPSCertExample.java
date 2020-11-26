package unit14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HTTPSCertExample {

    public static void main(String[] args) {

        //ssl certification

        //Desired capabilities
        //general chrom profile
        DesiredCapabilities ch = DesiredCapabilities.chrome();
        ch.acceptInsecureCerts(); //1
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); //2
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); //3

        //Belongs to your browser
        ChromeOptions option = new ChromeOptions();
        option.merge(ch);
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\selwd\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(option);

        //
    }
}
