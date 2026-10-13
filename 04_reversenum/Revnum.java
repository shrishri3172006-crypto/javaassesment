import java.util.Scanner;

public class Revnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        int rev=0;
        while(num>0){
            int number=num%10;
            rev=rev*10+number;
            num=num/10;
        }
        System.out.println(rev);
    }
    
}
