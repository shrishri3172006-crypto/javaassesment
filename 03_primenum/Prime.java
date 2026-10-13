
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("enter a number");
       int num=s.nextInt();
       int i;
       for( i=2;i<num;i++){
        if(num%i==0){
            System.out.println("notprime");
            break;
        }
       }
       if(i==num){
        System.out.println("prime");
       }
    }
}
