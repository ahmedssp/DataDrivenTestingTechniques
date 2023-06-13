import DATA.Apach_POI_REXCEL;
import DATA.Data;
import DATA.jdbc_DATABASE;
import org.testng.annotations.Test;

public class Tests  extends base{

    @Test(dataProvider = "Datagenerated_IFCOND",dataProviderClass = Data.class)
    public void TC1_1(String a,String b,String c){System.out.println(a+" "+b+" "+c);}

    @Test(dataProvider = "Testdata_generated_Excel",dataProviderClass = Apach_POI_REXCEL.class)
    public void TC1_2(String a,String b,String c,String d,String e) {System.out.println(a +"  "+b+"  "+c+"  "+d+"  "+e);}

    @Test(dataProvider = "Testdata_generated_DataBase",dataProviderClass = jdbc_DATABASE.class)
    public void TC1_3(String a,String b,String c,String d) {System.out.println(a +"  "+b+"  "+c+"  "+d);}

}
