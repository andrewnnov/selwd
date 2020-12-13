package testngtutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrives {

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream("C:\\Projects\\selwd\\src\\main\\java\\testngtutorial\\data.properties");
        prop.load(file);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser", "firefox");
        System.out.println(prop.getProperty("browser"));

        FileOutputStream fileOut = new FileOutputStream("C:\\Projects\\selwd\\src\\main\\java\\testngtutorial\\data.properties");
        prop.store(fileOut, null);


    }
}
