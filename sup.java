class NS{
    public NS(){
        System.out.println("Father");
    }

}
class AA extends NS{
    public AA(){
        System.out.println("Mother");

    }
    
}
public class sup{
    public static void main(String[] args){
        AA ob1 = new AA();
    }
}