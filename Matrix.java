import java.util.Scanner;


public class Matrix {
    private int [][]matrix;
    
    public Matrix(int size){
        matrix = new int[size][size];
        System.out.println("Created matrix, size = "+size);
    }
    
    private void swap(int x1, int y1, int x2, int y2){
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }
    
    public void printMatrix(){
        int i;
        int j;
        int x1 = 0;
        int y1 = matrix.length - 1;
        System.out.println();
        for(i=0; i<matrix.length; i++){
            for(j=0; j<matrix.length; j++){
                if(i == x1 && j == y1){
                    System.out.print("\u001B[33m");
                }
                System.out.printf("%4d ", matrix[i][j]);
                System.out.print("\u001B[0m");
            }
            x1++;
            y1--;
            System.out.println();
        }
        System.out.println();
    }
    
    public void populateMatrix(){
        Scanner in = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Enter matrix values: ");
        for(i=0; i<matrix.length; i++){
            for(j=0; j<matrix.length; j++){
                matrix[i][j] = in.nextInt();
            }
        }
    }
    public void flipMatrix(){
        int i;
        int j;
        int n = matrix.length;
        for(i=0; i<n; i++){
            for(j=0; j < n - 1 - i; j++){
                swap(i, j, n-1-j, n-1-i);
            }
        }
            
    }
}

