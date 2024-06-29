public class maxSubar {
    public static void main(String args[]){
        int num[]={1,-2,6,-1,3};
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currentsum=start==0? prefix[start]:prefix[end]-prefix[start-1];
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }
            System.out.println("The maximum sum is"+maxsum);
        }
    }
}
