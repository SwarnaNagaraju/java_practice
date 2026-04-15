class All{
    public All(){
        System.out.println("Father");
    }

    public All(int n){
        System.out.println("Older child");
    }

}
class taken extends All{
    public taken(){
        System.out.println("Mother");

    }
    public taken(int n){
        this();
        System.out.println("Younger child");
    }
    
}
public class sup3{
    public static void main(String[] args){
        taken ob1 = new taken(5);
    }
}