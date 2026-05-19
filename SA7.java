import java.util.*;
public class SA7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a:");
        float a = sc.nextFloat();

        System.out.print("Enter b:");
        float b = sc.nextFloat();

        System.out.print("Enter c:");
        float c = sc.nextFloat();

        if(a>b && a>c){
            System.out.print("a is greater");
        }
        else if(b>a && b>c){
            System.out.print("b is greater");
        }
        else{
            System.out.print("c is greater");
        }
    }
}