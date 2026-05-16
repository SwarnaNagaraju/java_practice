class profile{
    private String name;
    private int age;

    public profile(){

        name ="Swarna Nagaraju";
        age = 19;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        }
}
public class CC{
    
    public static void main(String[] args){
        
        profile pf= new profile();
        pf.display();
        
    }
}
