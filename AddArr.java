import java.util.*;
public class AddArr{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            System.out.println("arr[i]=" +arr[i]);
        }
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
            System.out.println("arr1[i]=" + arr1[i]);
        }
        int sum[] = new int[n];
        for(int i=0;i<n;i++){
            sum[i] = arr[i] + arr1[i];
            System.out.println("sum[i]=" +sum[i]);
        }
    }
}