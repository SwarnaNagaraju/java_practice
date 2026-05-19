class DOB{
    int date;
    int month;
    static int year;
    public void display(){
        System.out.println(date + " :" + month + " :" + year);
    }
}
public class YY{
    public static void main(String[] args){
        DOB ob1 = new DOB();
        ob1.date = 12;
        ob1.month = 5;
        DOB.year = 2007;

        DOB ob2 = new DOB();
        ob2.date = 13;
        ob2.month = 3;
        ob2.year = 2008;

        ob1.display();
        ob2.display();


    }
}