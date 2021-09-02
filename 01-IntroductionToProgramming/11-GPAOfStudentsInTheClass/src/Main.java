import java.util.*;

public class Main {
    public static void main(String[] args) {
        SumAverage();
    }
    public static void SumAverage(){

        float Sum = 0;
        float Average = 0;
        int count = 0;

        while(1==1) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            float a = sc.nextInt();

            if(a==-1){
                break;
            }
            count++;
            Sum = Sum + a;
            Average = Sum / count;

            System.out.println("Sum: " + Sum);
            System.out.println("Average: " + Average);
        }
    }
}
