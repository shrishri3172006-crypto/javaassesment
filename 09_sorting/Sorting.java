package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting implements Comparable<Sorting> {

  

       String Name;
       int age;
       Double salary;

       Sorting(String Name, int age, Double salary){
        this.Name=Name;
        this.age=age;
        this.salary=salary;

    



}
       @Override
       public int compareTo(Sorting o) {
        return this.Name.compareTo(o.Name);
       }

       public int campareTo(Sorting o){
		return Integer.compare(this.age, o.age);
        
       }

         public static void main(String[] args) {

            Sorting s1=new Sorting("shri",22,20000.0);
            Sorting s2=new Sorting("prithiya",23,30000.0);

            ArrayList<Sorting> Sorting=new ArrayList<Sorting>();

            Sorting.add(s1);
            Sorting.add(s2);

            Collections.sort(Sorting);

            for(Sorting s:Sorting){
                System.out.println(s.Name+" "+s.age+" "+s.salary);
            }



}
         
}
   