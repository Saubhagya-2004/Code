import java.util.Scanner;

public class Searchoperation2d {
    public static boolean operation(int matrix[][],int key){
        int n=matrix.length,m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found cell at"+"("+i+","+j+")");
                    return true;
                }
            }
            System.out.println();
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no of rows");
        int n=obj.nextInt();
        System.out.println("Enter coloum");
        int m=obj.nextInt();
        int matrix[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(matrix [i][j]+"");
            }
            System.out.println();
        }
       int key=obj.nextInt();
       operation(matrix, key);
    }
}
