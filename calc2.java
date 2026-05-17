public class B extends A{
    public int mul(int a,int b){
        return a * b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
public class calc2{
    public static void main(String[] args){
        
        int x = 10;
        int y = 20;
        B ob = new B();
        System.out.println(ob.mul(x,y));
        System.out.println(ob.div(x,y));
    }
}