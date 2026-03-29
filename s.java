import java.util.*;
public class s{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n:");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }

        
    }
}