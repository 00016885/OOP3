public class SoftwareProduct {
    String name;
    String version;

    public SoftwareProduct(String name, String version){
        this.name=name;
        this.version=version;
    }

    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Version:"+version);
    }
}
