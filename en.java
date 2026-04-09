// encapsulation 
class Human{
    String name;
    String gender;
    private int Age;
    
    public int GetAge(){
       return Age; 
    }

    public void setAge(int a){
        Age = 19 ;
    }

}
public class en{
    public static void main(){
        Human ob = new Human();
        ob.name = "Swarna";
        ob.gender = "female";
        ob.setAge(19);
        System.out.println(ob.name + "\n" + ob.gender  + "\n" + ob.GetAge());
    }
}