class abt_me{
    private String name;
    private int age;

    public String getname(){
        return name;
    }

    public void setname(String name,abt_me ob){
        abt_me  ob1 = ob;
        ob1.name = name;
    }

    public int getage(){
        return age;
    }
    public void setage(int age,abt_me ob){
       abt_me ob2 = ob;
       ob2.age = age;
    }

}
    public class sunny{
        public static void main(String[] args){

            abt_me ob = new abt_me();
            ob.setname("swarna",ob);
            ob.setage(12,ob);
            System.out.println(ob.getname() + "\n"+ob.getage());
        }
    }
