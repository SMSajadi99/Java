import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = myObj.nextInt();
        
        if(num < 10){
            System.out.println("ضعیف");            
        }else if((10 <= num) && (num <= 15)){
            System.out.println("خوب");
        }else if((num > 15) && (num <= 20)){
            System.out.println("عالی");
        }else{
            System.out.println("عدد وارد شده اشتباه است !!!");
        }
    }
}
