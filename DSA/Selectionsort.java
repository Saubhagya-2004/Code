public class Selectionsort {
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                  if(arr[min]>arr[j]){
                    min=j;
                  }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;

            }
        }
        
        }
        public static void main(String args[]){
            int number[]={2,7,9,0,5,4};
            Selection(number);
            for(int i=0;i<number.length;i++){
                System.out.print(number[i]+ "");
            }
    }
}
