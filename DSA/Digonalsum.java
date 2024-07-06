public class Digonalsum {
    public static int The_digonal(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];
            sum+=matrix[i][n-i-1];
        }
        if(n%2!=0){
            sum-=matrix[n/2][n/2];
        }
        return sum;
    }
    public static void main(String[] args) {
        int num[][]={{1,2,3,4},{2,3,4,7},{8,9,5,0},{4,7,9,2}};
        System.out.print(The_digonal(num));
    }
}

