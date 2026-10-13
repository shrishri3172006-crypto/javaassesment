package hierarchy;

public class Projectmanager extends Manager{
    String projectname;
    
    public Projectmanager(int id, String name, double salary,int teamsize, String projectname) {
        super(id, name, salary,teamsize);
        this.projectname=projectname;
    }
    
    void display(){
        super.display();
        System.out.println("Projectname"+projectname);
    }

}
