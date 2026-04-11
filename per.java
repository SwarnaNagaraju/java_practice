class profile{
    String name;
    private int age=27;
    private String relation;
    private float income;
    
    public int getage(int age){
        return age;
    }
    public String getrelation(){
        return relation;
    }
    public float getincome(){
        return income;
    }
}
public class per{
    public static void main(String[] args){
        profile pi = new profile();
        pi.name = "ashi";
        System.out.println(pi.name);
        pi.getage(23);
        System.out.println(pi.getage(23));
        

    }
}