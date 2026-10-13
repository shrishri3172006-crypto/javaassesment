import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter second number");
        int b=s.nextInt();
        System.out.println("enter operator(+,-,*,/):");
        String op=s.next();
      switch(op) {
            case "+":
                System.out.println("Addition"+(a+b));
            break;
            case"-":
                System.out.println("Subtraction"+(a-b));
                break;
             case "*":
                System.out.println("Multiplication"+(a*b)); 
                break;
             case"/":
             if(b!=0){
               System.out.println("Division"+(a/b));   
              }
              else{
                System.out.println("cannot divide zero");
              }
               
            default:
                System.out.println("invalid");
        }
            
        }

    }
    

