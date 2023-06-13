package DATA;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;

public class Apach_POI_REXCEL {

    @DataProvider(name = "Testdata_generated_Excel")
    public static Object[][] getExcelData() {
        Object [][] data;

        File x=new File(System.getProperty("user.dir")+"Resources/tets.xlsx");
        try {
            XSSFWorkbook WB=new XSSFWorkbook(x);
            XSSFSheet sheet=WB.getSheet("Sheet1");
            int n_rows= sheet.getPhysicalNumberOfRows();
            int n_colum=sheet.getRow(0).getLastCellNum();
            data=new String[n_rows-1][n_colum];
            for(int a=1;a<n_rows;a++){
                for (int b=0;b<n_colum;b++){
                    XSSFRow row_in=sheet.getRow(a);
                    data[a-1][b]=row_in.getCell(b).getStringCellValue();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
        return data;
}}
