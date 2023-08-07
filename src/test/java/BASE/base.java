package BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base  {
    protected WebDriver d;

    protected GenerateData_employee employeeOBJ;

    @BeforeMethod
    public void Sutup(){
        d=new ChromeDriver();
        employeeOBJ=new GenerateData_employee();
        employeeOBJ.Valed_employeedata();
        System.out.println("WE are in before method");

    }
    @AfterMethod
    public void Qiut() throws InterruptedException {
        System.out.println("WE are in After method");
        }

}
