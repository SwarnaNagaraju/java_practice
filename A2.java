import java.util.*;
public class A2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of a array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }
}