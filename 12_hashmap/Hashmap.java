package hashmap;
import java.util.HashMap;



public class Hashmap {

    public static void main(String[] args) {
        
        HashMap <String,Integer> marks = new HashMap<>();

        marks.put("Arun", 85);
        marks.put("Ravi", 90);
        marks.put("Kumar", 78);

        System.out.println("Marks of Ravi: " + marks.get("Ravi"));

    }

}
