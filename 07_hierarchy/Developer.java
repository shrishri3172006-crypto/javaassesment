package hierarchy;

public class Developer extends Employee{
    String programminglanguage;

    public Developer(int id, String name, double salary ,String programminglanguage) {
        super(id, name, salary);
        this.programminglanguage=programminglanguage;
    }
    void display(){
        super.display();
        System.out.println("language"+programminglanguage);
    }

}
