import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;

public class Tests  extends base{

    @Test(dataProvider = "Datagenerated_IFCOND",dataProviderClass = Data.class)
    public void TC1_1(String a,String b,String c){System.out.println(a+" "+b+" "+c);}

    @Test(dataProvider = "Testdata_generated_Excel",dataProviderClass = Data.class)
    public void TC1_2(String a,String b,String c,String d,String e) {System.out.println(a +"  "+b+"  "+c+"  "+d+"  "+e);}

    @Test(dataProvider = "Testdata_generated_DataBase",dataProviderClass = jdbc_DATABASE.class)
    public void TC1_3(String a,String b,String c,String d) {System.out.println(a +"  "+b+"  "+c+"  "+d);}

    public static void main(String[] args) throws IOException, InvalidFormatException {
        Data X=new Data();
        System.out.println(Arrays.deepToString(X.getExcelData()));
    }
}
