class worker{
    String name;
    private int salary ;
    String domain ;
    private String  intern ;

    public String infointern(String intern){
        return intern;
    }

    public int setsalary(int n){
        return n;
    }
}
public class wor{
    public static void main(String[] args){
        worker ob = new worker() ;
        ob.name = "Appi";
        ob.domain = "software";
        ob.setsalary(40000);
        ob.infointern("contact me if you want to intern in your company");
        System.out.println(ob.name + "\n" + ob.domain + "\n" + ob.setsalary(40000) + "\n" + ob.infointern("contact me if you want to intern in your company"));


    }
}
