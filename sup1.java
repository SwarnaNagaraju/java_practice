class NSS{
    public NSS(){
        System.out.println("Father");
    }

    public NSS(int n){
        System.out.println("Older child");
    }

}
class AAA extends NSS{
    public AAA(){
        System.out.println("Mother");

    }
    public AAA(int n){
        System.out.println("Younger child");
    }
    
}
public class sup1{
    public static void main(String[] args){
        AAA ob1 = new AAA(5);
    }
}