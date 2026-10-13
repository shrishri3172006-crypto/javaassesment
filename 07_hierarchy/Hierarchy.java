package hierarchy;

import java.util.ArrayList;
import java.util.List;

public class Hierarchy {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        
        employee.add(new Developer(1,"suji",20000,"java"));
        employee.add(new Manager(2,"prithiya",30000,5));
        employee.add(new Projectmanager(3,"priya",40000,10,"student management system"));

        for(Employee e: employee){
            e.display();
        }
    }
    
}
