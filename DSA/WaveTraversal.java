import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=obj.nextInt();                                   
        int m=obj.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                
                arr[i][j]=obj.nextInt();
            }
        }
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i][j]);
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--){
                    System.out.print(arr[i][j]);
            }
        }
    }
    }
}
