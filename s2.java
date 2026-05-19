import java.util.*;
public class s2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n of elements:");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        System.out.print("Enter the n elements:");
  ;
        for(int i=0; i<n; i++){
            for(int j=0; j<n ;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
    }
}