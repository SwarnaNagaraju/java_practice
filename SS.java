class mobile{
    String brand;
    int price;
    static String name;
    public void display(){
    System.out.println(brand + "   " + price+ "  " +name);
}
}
public class SS{
    public static void main(String[] args){
        mobile ob1 = new mobile();
        ob1.brand = "Apple";
        ob1.price = 110000;
        mobile.name = "Smartphone" ;
        ob1.display();

        mobile ob2 = new mobile();
        ob2.brand = "Vivo";
        ob2.price = 120000;
        mobile.name = "phone";
        ob2.display();
    }
}