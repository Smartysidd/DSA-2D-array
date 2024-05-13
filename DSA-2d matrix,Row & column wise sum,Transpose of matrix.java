import java.util.*;
class Main {

    
    //Transpose Of a matrix//
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
   
   //2D matrix column wise sum//
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
    
     //2D matrix row wise sum//
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
    
   //Printing of a 2D matrix//
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
    
    //Declaration and initialization of a 2D matrix//

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
    //calling functions//
    
    print2d(mat);
    printRsum(mat);
    printcsum(mat);

    // Transpose the matrix
    
    int[][] Tmat1 = findtrans(mat);
    // Print the transposed matrix
    print2d(Tmat1);
}}


