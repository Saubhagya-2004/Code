public class digitproduct {
    public static void main(String[] args) {
        int x=prod(1432);
           System.out.println(x);
    }
    static int prod(int n){
        if(n%10==n){                        //as follows as digit sum
            return n;
        }
        return (n%10)*prod(n/10);       //1432=(1432%10)*(1432/10)=2*f(143)*3*f(14)*4*f(1)
    }
}
