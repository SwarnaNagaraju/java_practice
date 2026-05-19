class A{
    public int add(int a,int b){
        return a + b;
    }

    public int sub(int a,int b){
        return a - b;
    }
}
    public class ACA{
        public static void main(String[] args){
            int x = 10;
            int y = 20;
            A ob = new A();
            System.out.println(ob.add(x,y));
            System.out.println(ob.sub(x,y));
        }
    }