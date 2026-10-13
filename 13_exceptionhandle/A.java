package Multiplexception;

public class A {

    

    static void getName() {
        try {
            System.out.println("Student Name: Shri");
        } catch (Exception e) {
            System.out.println("Error in getName");
        }
    }

    static void getDisplay() {
        try {
            System.out.println("Student Details");
        } catch (Exception e) {
            System.out.println("Error in getDisplay");
        }
    }

    public static void main(String[] args) {

        getName();
        getDisplay();
    }
}


