class prof
{
    String name;
    int age;

    public prof(String n,int a)
    {
        n = name;
        a = age;
    }
}
public class CP{
    public static void main(String[] args){
        prof pf = new prof("Ani",19);
        System.out.println(pf.name + ":" +pf.age);
    }
}