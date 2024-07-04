public class Spiral {
    public static void spiral_matrix(int matrix[][]){
        int startrow=0;
        int startcols=0;
        int endrow=matrix.length-1;
        int endcols=matrix[0].length-1;
        while(startrow<=endrow && startcols<=endcols){
            for(int j=startcols;j<=endcols;j++){
                System.out.print(matrix[startrow][j]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcols]+"");
            }
            for(int j=endcols-1;j>=startcols;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+"");
            }
            for(int i=endrow-1;i>=startrow;i--){
                if(startcols==endcols){
                    break;
                }
                System.out.print(matrix[i][startcols]);
            }
            startrow++;
            startcols++;
            endrow--;
            endcols--;
            

        }
        System.out.println();
}
public static void main(String[] args) {
    int num[][]={{1,2,3,4},{5,6,7,8},{7,4,5,3},{6,7,8,9}};
spiral_matrix(num);
}
}
