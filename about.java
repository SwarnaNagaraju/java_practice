class about{
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
public class ab{
    public static void main(String[] args){
        about ob = new about();
        ob.name("Swarna");
        ob.age(19);
        System.out.println(ob.name + "\n" + ob.age);
    }
}