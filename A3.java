import java.util.*;
public class A3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        int A[][] = new int[n][n];
        System.out.println("Enter the elemts of the matrix A:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j] = sc.nextInt();
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}