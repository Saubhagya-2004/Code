public class Largestoddstring {
    public static String oddnum(String num){
          for(int i=num.length()-1;i>=0;i--){
              
                 char ch=num. charAt(i);/*here i is string index and charAt convert string index no */
                 if(ch%2!=0){       /*in case given string last num  is odd then it print  */
                    return num.substring(0,i+1);
                 }
                 
             }
             return " ";
          }
    
    public static void main(String[] args) {
        String str="4206";     /*in case largest odd string given string if string last num is div by 2 then its not print */
        String str1="34997";
        String str2="0249";
        System.out.println(oddnum(str));
        System.out.println(oddnum(str1));
        System.out.println(oddnum(str2));
    }
}
