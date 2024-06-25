public class rev {
    public static void main(String[] args) {
        fun(5);
        funrev(1);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        funrev(n+1);

    }
}
