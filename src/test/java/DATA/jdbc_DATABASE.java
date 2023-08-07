package DATA;

import org.testng.annotations.DataProvider;

import java.sql.*;

import static java.lang.String.valueOf;
import static java.sql.ResultSet.*;

public class jdbc_DATABASE {
    @DataProvider(name = "Testdata_generated_DataBase")
    public Object[][]  ReadData_base() throws SQLException,RuntimeException {

            Connection   con = DriverManager.getConnection("jdbc:mysql://localhost", "root" ,  "ahmed");
            Statement st= con.createStatement(TYPE_SCROLL_INSENSITIVE,CONCUR_READ_ONLY);
            ResultSet data=st.executeQuery("SELECT *FROM DB1.CARS ");
            //get number Rows
            data.last();
            int n_rows= data.getRow();
            data.beforeFirst();

            //get number coulum
            ResultSetMetaData meta=data.getMetaData();
            int n_colums= meta.getColumnCount();

           Object arr[][]=new Object[n_rows][n_colums];
           int j=0;
           //read data from database and store it in two Dimintional array
            while (data.next()){
                for (int i=0;i<n_colums;i++){
                    arr[j][i]=data.getString(i+1);
               }
                j++;}
            return arr;
    }

}
