package DATA;

import com.github.javafaker.Faker;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.Random;

import java.io.*;

public class Data {
    private String name1,name2,name;
    private  int q1, q2;
    public String VALID_Generate_name() {
        name1 = new Faker().internet().domainName().replace(".", "");
        name2 = name1.split("")[0].toUpperCase();
        return name2 + name1;
    }
    public String VALID_Generate_phone() {
        q1 = 10000 + (int) (new Random().nextFloat() * 89990);
        q2 = 10000 + (int) (new Random().nextFloat() * 89990);
        return "0" + String.valueOf(q1) + String.valueOf(q2);
    }
    public String inVALID_Generate_name() {
        name1 = new Faker().internet().domainName().replace(".", "");
        return name1;
    }
    public String INVALID_Generate_phone() {
        q1 = 1000 + (int) (new Random().nextFloat() * 899);
        q2 = 100000 + (int) (new Random().nextFloat() * 899900);
        return String.valueOf(q1) + String.valueOf(q2);
    }
    public String ValidEmail_Generater(){

        return new  Faker().internet().emailAddress();
    }
    public String INValidEmail_Generater(){

        return new  Faker().internet().emailAddress().replace("@","");
    }

    @DataProvider(name = "Datagenerated_IFCOND")
    public  Object [][] arrfunc(){
        String [][] arr=new String[3][3];
        for (int x=0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                if(y==0){ arr[x][y]=VALID_Generate_name();}
                if(y==1){ arr[x][y]=ValidEmail_Generater();}
                if(y==2){ arr[x][y]=VALID_Generate_phone();}
                else {arr[x][y]=inVALID_Generate_name();}
            }
        }
        return arr;
    }
    @DataProvider(name = "Testdata_generated2")
    public Object [][] Test_data2(){

        Object data[][] = new Object[2][3];
        data[0][0]=VALID_Generate_name(); data[0][1]=VALID_Generate_name(); data[0][2]=VALID_Generate_name();
        data[1][0]=VALID_Generate_name(); data[1][1]=VALID_Generate_name(); data[1][2]=VALID_Generate_name();
        return data;
    }

}

