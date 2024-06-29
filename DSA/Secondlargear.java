public class Secondlargear {
    public static int The_large (int a[]){
        int max1=0,max2=1;
        if(a[0]>a[1]){
            max1=a[0];
            max2=a[1];
        }
        else{
            max1=a[1];
            max2=a[0];
        }
        for(int i=2;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2){
                max2=a[i];
            }
        }
        return max2;
    }
    public static void main(String[] args) {
        int number[]={2,6,7,9,0,5,8,2};
        System.out.println("LArgest number"+The_large(number));
    }
}
