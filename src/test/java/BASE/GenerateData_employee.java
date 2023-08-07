package BASE;

import DATA.Employee;
import com.github.javafaker.Faker;
import org.apache.poi.openxml4j.opc.PackageRelationship;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GenerateData_employee  extends Employee {
    protected Faker fakData;

    public void Valed_employeedata(){

        fakData=new Faker(Locale.ENGLISH);

        setID(String.valueOf(fakData.random().nextInt(100000,10000000)));
        setF_NAME(fakData.name().firstName());
        setL_NAME(fakData.name().lastName());
        setADDRESS(fakData.address().fullAddress());
        setEMAIL(fakData.internet().emailAddress());
        setPHONE_NUMBER(fakData.numerify("##+##########"));
        setPassword(fakData.internet().password(5,10,true,true,true));

    }
    public void Vdatatoxml(){

        fakData=new Faker(Locale.ENGLISH);
        setID(String.valueOf(fakData.random().nextInt(100000,10000000)));
        setF_NAME(fakData.name().firstName());
        setL_NAME(fakData.name().lastName());
        setADDRESS(fakData.address().fullAddress());
        setEMAIL(fakData.internet().emailAddress());
        setPHONE_NUMBER(fakData.numerify("##+##########"));
        setPassword(fakData.internet().password(5,10,true,true,true));


    }




}
