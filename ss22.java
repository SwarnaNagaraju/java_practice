class abtyou{
    private String name;
    private int age;

    public String getname(){
        return name;
    }

    public void setname(String name,abt_you ob){
        abtyou ob1 = ob;
        ob1.name = name;
    }

    public int getage(){
        return age;
    }
    public void setage(int age,abt_you ob){
       abtyou ob2 = ob;
       ob2.age = age;
    }

}
    public class ss22{
        public static void main(String[] args){

            abtyou ob = new abtyou();
            ob.setname("swarna",ob);
            ob.setage(12,ob);
            System.out.println(ob.getname() + "\n"+ob.getage());
        }
    }
