import java.util.*;
class Main {
    
    // static int add2matrix(int [][]M1 , int [][]M2){
    //     int r=M1.length;
    //     int c=M1[0].length;
    //     int [][]M3=new int[r][c]; 
    //     for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             M3[i][j]=M1[i][j]+M2[i][j];
    //         }
           
    //     }
    //      return M3;
    // }
   static int[][] findtrans(int[][] M){
         int R=M.length;
        int C=M[0].length;
        int[][] Tmat=new int[C][R];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                Tmat[j][i]=M[i][j];
            }
        }
        return Tmat;
   }
    static void printcsum(int [][] M){
        int r=M.length;
        int c=M[0].length;
        for(int i=0;i<c;i++){
            int sum=0;
            for(int j=0;j<r;j++){
                sum=sum+M[j][i];
            }
            System.out.println(sum);
        }
    }
    
    static void printRsum(int [][]M)
    {
         int r=M.length;
        int c=M[0].length;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum=sum+M[i][j];
            }
            System.out.println(sum);
        }
         System.out.println(" ");
    }
    static void print2d(int[][] M)
    
    {
        int r=M.length;
        int c=M[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(M[i][j]+ " ");
            }
            System.out.println(" ");
           
        }
    }
    
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] mat = new int[r][c];
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            mat[i][j] = sc.nextInt();
        }
    }
    print2d(mat);
    printRsum(mat);
    printcsum(mat);

    // Transpose the matrix
    int[][] Tmat1 = findtrans(mat);
    // Print the transposed matrix
    print2d(Tmat1);
}}


