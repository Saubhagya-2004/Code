public class Lexicographstr {
    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana"}; /*it compare its ascii value A-Z 65-90 and a-z=97-122 */
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }
        }
        System.out.println(largest);
    }
}
