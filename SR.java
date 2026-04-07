class mobile{
    String brand;
    int price;
    static String name;
}
public class SR{
    public static void main(String[] args){

        mobile ob = new mobile();
        ob.brand = "Apple" ;
        ob.price = 100000000 ;
        mobile.name = "smart" ;
        System.out.println("object:" + ob.brand + "price:" + ob.price + "name:" + ob.name);

        mobile ob1 = new mobile();
        ob1.brand = "VIVO";
        ob1.price = 102000;
        mobile.name = "phone";
        System.out.println("object:" + ob1.brand + "price:" + ob1.price + "name:" + ob1.name);

    }
}