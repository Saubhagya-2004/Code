public class fibo {
    public static void main(String[] args) {
        int x= fibo(5);
        System.out.println(x);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
       return fibo(n-1)+fibo(n-2);
    }
}
