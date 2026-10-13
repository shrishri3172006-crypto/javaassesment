package latestversion;

public class Version {

    public static void main(String[] args) {


        String V1 = "3.11.54.2";
        String V2 = "3.11.53.1";

        String[] a=V1.split("\\.");
        String[] b=V2.split("\\.");

        for(int i=0;i<a.length;i++){

            int x=Integer.parseInt(a[i]);
            int y=Integer.parseInt(b[i]);

            if(x>y){
                System.out.println( "greater than is "+V1);
                return;
            }
             if(x<y){
                System.out.println(" greater than is "+V2);
                return;
            }
        }
            
                System.out.println("Both are equal");
            
        }
    }

