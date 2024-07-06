import java.util.*;
public class Digonaltraverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        for(int g=0;g<arr.length;g++){     /**g= for gap of array i,j */
            for(int i=0,j=g;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
