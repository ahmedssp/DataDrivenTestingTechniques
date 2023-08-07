package DATA;

import com.github.javafaker.Faker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Generated_arraylist_JFK {
    static Faker f=new Faker();
    public static ArrayList namelist(int Rows) {
        ArrayList<String> namelist=new ArrayList<>();
        while (namelist.size()<Rows){
            String name = f.name().firstName();
            if(!namelist.contains(name)){namelist.add(name);}}
        return namelist;
    }
    public static ArrayList Emaillist(int Rows) {
        ArrayList<String> namelist2=new ArrayList<>();
        while (namelist2.size()<Rows){
            String name2 = f.internet().emailAddress();
            if(!namelist2.contains(name2)){namelist2.add(name2);}}
        return namelist2;
    }
    public static ArrayList PhoneList(int Rows) {
        ArrayList<String> namelist2=new ArrayList<>();
        while (namelist2.size()<Rows){
            String name2 = f.numerify("##+##########");
            if(!namelist2.contains(name2)){namelist2.add(name2);}}
        return namelist2;
    }
    public static ArrayList UniqueFaker(int Row,String fakData) {
        ArrayList<String> namelist2=new ArrayList<>();
        while (namelist2.size()<Row){
            String name2 = fakData;
            if(!namelist2.contains(name2)){namelist2.add(name2);}}
        return namelist2;
    }

    public static String ArrayToString(int n_rwos,String list1name, ArrayList list1,String list2name,ArrayList list2,String list3name,ArrayList list3,String list4name,ArrayList list4){
        String listData=list1name+list2name+list3name+list4name;
        for(int x=0;x<n_rwos;x++){
            listData= listData+"\n"+ String.valueOf(list1.get(x)+","+list2.get(x)+","+list3.get(x)+","+list4.get(x));
        }
        return listData;
    }
    static void AddToNewEXCEL(String path, String content) throws IOException {
        try {
            File x = new File(path);
            File file = new File(path);

            if (!file.exists())
                file.createNewFile();

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content);
            bw.close();
        }
        catch( NullPointerException ignore){

        }

    }

    public static void main(String[] args) throws IOException {

        AddToNewEXCEL(
                System.getProperty("user.dir")+"\\Resources\\file1.csv",

                                                                      ArrayToString(6,
                                                                           "FName,",namelist(6),
                                                                      "Lname,",namelist(6),
                                                                      "Email,", Emaillist(6),
                                                                      "Phone,",PhoneList(6))
        );

    }
}
