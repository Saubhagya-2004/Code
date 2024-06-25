public class digitsum {
    public static void main(String args[]){
        int ans=sum(1234);                           //n=1234 then sum =1+2+3+4=10
        System.out.println(ans);                        //1+f(234)+2+f(34)+3+f(4)
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);                      //f(1234)=(1234%10)+f(1234/10)=4+f(123)+3+f(12)+2+f(1)
    }                                                   //          |
}                                                               //reiminder (last no of the digit)
