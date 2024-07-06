import java.util.Scanner;
public class Saddlepoint {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        int small=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                if(arr[i][small]>arr[j][i]){
                    small=j;
                }
                boolean flag=true;
                for(int k=0;k<arr.length;k++){
                    if(arr[k][small]>arr[i][small]){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println(arr[i][small]);
                }
            }
            System.out.println();
        }
    }
}
