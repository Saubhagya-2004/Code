public class Stock {
   public static int The_stock(int a[]){
    int maxprofit=0;
    int minprofit=a[0];
     for(int i=0;i<a.length;i++){
        minprofit=Math.min(minprofit, a[i]);
        int profit=a[i]-minprofit;
        maxprofit=Math.max(maxprofit, profit);
     }
     return maxprofit;
   }
   public static void main(String[] args) {
    int num[]={2,4,9,7,0,1};
    System.out.println(The_stock(num));
   }
}
