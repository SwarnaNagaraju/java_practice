class know{
    private String name;
    private int age;
    private float income;

    public String setname(String n){
        return n = name;
    }

    public int setage(int a){
        return a = age;
    }
}
public class SAA{
    public static void main(String[] args){
        know ob = new know();
        ob.setname("Swarna");
        ob.setage(19);
        System.out.println(ob.setname("Swarna") + "\n" + ob.setage(19));
    }
}