import com.github.javafaker.Artist;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Scanner;

public class tets {
   private static ArrayList <String> arr=new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Faker f=new Faker();

        while (arr.size()<10){
            String name2 = sc.next();
            String name = f.name().firstName();
            if(!arr.contains(name)) { arr.add( name);}
        }
        System.out.println( (arr));

    }
}
