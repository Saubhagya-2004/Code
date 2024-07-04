import java.util.*;
public class Largestno2D {
    public static void Large(int arr[][]){
        int largest=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println(largest+"largest number");
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter row");
        int n= obj.nextInt();
        System.out.println("Enter colouum no");
        int m=obj.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        Large(arr);
    }
}
