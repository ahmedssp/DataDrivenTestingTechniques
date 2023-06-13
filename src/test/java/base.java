import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class base {

    @BeforeMethod
    public void Sutup(){
        System.out.println("WE are in before method");

    }
    @AfterMethod
    public void Qiut() throws InterruptedException {
        System.out.println("WE are in After method");
        }
}
