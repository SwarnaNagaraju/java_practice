import java.util.*;

public class Arr{
    public static void main(String[] args){
        int arr[][] = new int[3][3];
        for (int i = 0;i<3 ;i++){
            for(int j=0 ;j<3; j++){
            arr[i][j]=i+1;
            System.out.print(arr[i][j]);
        }
        System.out.print("\n");
        }
    }
}