public class Insertionsort {
    public static void Insert(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String args[]){
         int num[]={2,6,9,0,4,1};
         Insert(num);
         for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
         }
    }
    
}
