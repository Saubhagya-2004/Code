import java.util.*;
public class Stringcompression {
    public static String compress1(String str){
        String sc=str.charAt(0)+" ";
        for(int i=1;i<str.length();i++){
            char cur=str.charAt(i);
            char prev=str.charAt(i-1);
            if(cur!=prev){
                sc+=cur;
            }
        }
        return sc;
    }
        public static String compress2(String str){
            String sc=str.charAt(0)+" ";      /*here convert char to string using empty string +"" */
            int count=1;
            for(int i=1;i<str.length();i++){
                char cur=str.charAt(i);
                char prev=str.charAt(i-1);
                if(cur==prev){
                    count++;
                }
                else{
                    if(count>1){
                        sc+=count;
                        count=1;
                    }
                    sc+=cur;
                }
                
            }
            if(count>1){
                sc+=count;
                count=1;
            }
            return sc;
        }

    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String scr=obj.next();
        System.err.println(compress1(scr));
        System.err.println(compress2(scr));
    }
}
