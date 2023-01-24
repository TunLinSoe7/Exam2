package exam_2;
class Company{
    String location;
    String companyName;

    public Company(String location, String companyName) {
        this.location = location;
        this.companyName = companyName;
    }
}
class Client{
    Company company;
    String name;
    int age;

    public Client(String name, int age,Company company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }
    void info(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(company.companyName);
        System.out.println(company.location);
    }
}
public class Aggeragtion {
    public static void main(String[] args) {
        Company company1 = new Company("Yangon","CodeWall");
        Client client = new Client("Tun Lin Soe",20,company1);
        client.info();
    }
}
