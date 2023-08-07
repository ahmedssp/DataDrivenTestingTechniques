package TEST;

import BASE.base;
import DATA.Apach_POI_REXCEL;
import DATA.Data_random_bad;
import DATA.jdbc_DATABASE;
import org.testng.annotations.Test;
public class Tests  extends base {
    @Test(dataProvider = "Datagenerated_IFCOND_t",dataProviderClass = Data_random_bad.class)
    public void TC1_10(String a,String b,String c){System.out.println(a+" "+b+" "+c);}
    @Test(dataProvider = "Datagenerated_IFCOND",dataProviderClass = Data_random_bad.class)
    public void TC1_1(String a,String b,String c){System.out.println(a+" "+b+" "+c);}
    @Test(dataProvider = "Testdata_generated_Excel",dataProviderClass = Apach_POI_REXCEL.class)
    public void TC1_2(String a,String b,String c,String d) {System.out.println(a +"  "+b+"  "+c+"  "+d);}
    @Test(dataProvider = "Testdata_generated_DataBase",dataProviderClass = jdbc_DATABASE.class)
    public void TC1_3(String a,String b,String c,String d) {System.out.println(a +"  "+b+"  "+c+"  "+d);}
    @Test
    public void TC1_4() {
        //javaFaker--- employee class
        System.out.println(employeeOBJ.getID());
        System.out.println(employeeOBJ.getF_NAME());
        System.out.println(employeeOBJ.getL_NAME());
        System.out.println(employeeOBJ.getEMAIL());
        System.out.println(employeeOBJ.getPHONE_NUMBER());
        System.out.println(employeeOBJ.getPassword());
        //generate custum data
        System.out.println(Data_random_bad.VALID_Generate_phone());
    }
}
