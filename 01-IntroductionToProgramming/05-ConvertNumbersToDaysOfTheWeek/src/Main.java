import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = myObj.nextInt();

        String[] array={"sat","sun","mon","tues","wed","thurs","fri"};
//        System.out.println("Printing Array: "+Arrays.toString(array));
        List<String> list=new ArrayList<String>();

        for(String lang:array){
            list.add(lang);
        }

        System.out.println(list.get(num));
    }
}
