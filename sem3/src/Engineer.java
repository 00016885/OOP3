public class Engineer extends Employee{
    String specialization;

    public Engineer(String name, String departament, String specialization){
        super(name, departament);
        this.specialization=specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization:"+specialization);
    }
}
