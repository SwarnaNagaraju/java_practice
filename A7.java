class student{
    int rollno;
    float marks;
    String name;
}
public class A7{
    public static void main(String[] args){
        student s1 = new student();
        s1.rollno = 1;
        s1.marks = 92.3f;
        s1.name = "Navi";

        student s2 = new student();
        s2.rollno = 2;
        s2.marks = 97.7f;
        s2.name  = "Abhi" ;

        student s3 = new student();
        s3.rollno = 3;
        s3.marks = 96.32f;
        s3.name = "Ani" ;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for( student n : students){
            System.out.println(s1.name + "   "  + s1.rollno  + "  "  + s1.marks );
            System.out.println(s2.name + "   "   + s2.rollno + "  "  + s2.marks );
            System.out.println(s3.name + "   "   + s3.rollno + "  "  + s3.marks );
        }

    }
}