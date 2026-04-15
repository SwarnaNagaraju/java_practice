class create{
    private String user;
    private int strike;

    public create(int n){
        System.out.print("you can see");
    }

    public void setuser(String user){
        this.user = user;
    }

    public void setstrike(int strike){
        this.strike=strike;
    }
}
public class constr1{
    public static void main(String[] args){
        create c1 = new create(10);
        c1.setuser("Avi");
        c1.setstrike(10);
    }
}