public class A6{
    public static void main(String[] args){
        int n[][] = new int[4][];     // jagged
        n[0] = new int[2];
        n[1] = new int[3];
        n[2] = new int[2];
        n[3] = new int[5];

        for(int i=0;i<n.length; i++){
            for(int j=0; j<n[i].length;j++){
                n[i][j] = (int)(Math.random()*100);
            }
        }

        for(int nums[] : n){
            for(int m : nums){
                System.out.print(m + " ");
            }
            System.out.println();
        }                          
    }
}