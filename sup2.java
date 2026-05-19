class N{
    public N(){
        System.out.println("Father");
    }

    public N(int n){
        System.out.println("Older child");
    }

}
class S extends N{
    public S(){
        System.out.println("Mother");

    }
    public S(int n){
        super( n);
        System.out.println("Younger child");
    }
    
}
public class sup2{
    public static void main(String[] args){
        S ob1 = new S(5);
    }
}