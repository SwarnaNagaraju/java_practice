
public class In{
    public static void main(String[] args){
        advcalc ob = new advcalc();
        int r1=6;
        int r2=3;
        ob.add(r1,r2);
        ob.sub(r1,r2);
        ob.multi(r1,r2);
        ob.div(r1,r2);
        System.out.println(ob.add(r1,r2) + ":" +ob.sub(r1,r2));
        System.out.println(ob.multi(r1,r2) + ":" +ob.div(r1,r2));
    }
}