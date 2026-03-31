public class A1{
    public static void main(String[] args){
        int n[] = {1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.print(n[i]);
            System.out.println(n[1]);
        }
        System.out.println( n[2]);

        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){   
                System.out.print("   2D element=" +  a[i][j]);
            }
            System.out.println();
        }
    }
}