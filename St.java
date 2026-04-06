class mobile{
    String brand ;
    int price ;
    static String name ;
}
public void display(){
    System.out.println("Brand" + brand + "Price" + price + "name" + name);
}
public class St{
    public static void main(String[] args){
        mobile ob1 = new mobile();
        ob1.brand = "Apple";
        ob1.price = 110000;
        mobile.name = "Smartphone" ;
        ob1.display();
    }
}