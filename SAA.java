class knows{
    private String name;
    private int age;

    public String setname(String n){
        return n = name;
    }

    public int setage(int a){
        return a = age;
    }
}
public class SAA{
    public static void main(String[] args){
        knows ob = new knows();
        ob.setname("Swarna");
        ob.setage(19);
        System.out.println(ob.setname("Swarna") + "\n" + ob.setage(19));
    }
}