public class Employee {
    String name;
    String departament;

    public Employee(String name, String departament){
        this.name=name;
        this.departament=departament;
    }

    public void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Departament:"+departament);
    }
}
