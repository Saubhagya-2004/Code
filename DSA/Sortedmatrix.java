public class Sortedmatrix {
    public static boolean The_sort(int matrix[][],int key){
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==key){
                System.out.println("Found index at"+"("+i+","+j+")");
                return true;
            }
            else if(matrix[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.print("key not found");
        return false;
    }
    public static void main(String[] args) {
        int num[][]={{10,20,30,40},{11,23,32,42},{13,24,35,45},{15,29,38,48}};
        int key=62;
        The_sort(num,key);
    }
}
