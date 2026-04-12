class abt_you{
    private String name;
    private int age;

    public String getname(){
        return name;
    }

    public void setname(String name,abt_you ob){
        this.name = name;
    }

    public int getage(){
        return age;
    }
    public void setage(int age,abt_you ob){
       this.age = age;
    }

}
    public class ss33{
        public static void main(String[] args){

            abt_you ob = new abt_you();
            ob.setname("swarna",ob);
            ob.setage(12,ob);
            System.out.println(ob.getname() + "\n"+ob.getage());
        }
    }
