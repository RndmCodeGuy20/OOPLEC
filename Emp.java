public class Emp {
    int id;
    String Name;
    Address address;


    Emp(int id, String Name, Address address){
        this.id = id;
        this.Name = Name;
        this.address = address;
    }

    public void display() {
        System.out.println(id + " " + Name);
        System.out.println(address.City + " " + address.State + " " + address.Country);
    }

    public static void main(String[] args) {
        Address add1 = new Address("Maharashtra", "Nagpur", "India");
        Address add2 = new Address("Goa", "Goa", "India");

        Emp e1 = new Emp(111, "Shantanu", add1);
        Emp e2 = new Emp(120, "Mane", add2);
        e1.display();
        e2.display();
    }
}
