package hierarchy;

public class Manager extends Employee {
    int teamsize;
    
    public Manager(int id, String name, double salary,int teamsize) {
        super(id, name, salary);
        this.teamsize=teamsize;
    }
    
   void display(){
    super.display();
    System.out.println("teamsize"+teamsize);
   }
}
