class student{
    int rollno;
    float marks;
}
public class A7{
    public static void main(String[] args){
        student s1 = new student();
        s1.rollno = 1;
        s1.marks = 92.3f;

        student s2 = new student();
        s2.rollno = 2;
        s2.marks = 97.7f;

        student s3 = new student();
        s3.rollno = 3;
        s3.marks = 96.32f;

        student students[] = new student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0;i<2;i++){
            System.out.println("RollNo " + s2.rollno + " marks is " + s2.marks);
        }

    }
}