package Exception;

import java.util.Scanner;

public class Multipleexception {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();

        System.out.println("Enter a number :");
        int b = sc.nextInt();

        int result=a/b;
        int[] arr = new int[1];
        arr[0] = result;

        System.out.println("Result: " + arr[0]);
        }

    
    catch (ArithmeticException e) {
        System.out.println("cannot divide by zero");
    } 
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("invalid array index");
    }
     catch (Exception e) {
        System.out.println("Exception: " + e.getMessage());
    }
}

    
}

    

