class human{
    private String name;
    private int age;

    public human(){
        System.out.println("constant");
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
}
public class constr{
    public static void main(String[] args){
        human ob = new human();
        human ob1 = new human();
        ob.setname("john");
        ob.setage(23);
        System.out.println( ob.getage()+ ":"+ ob.getname());  
      }
}