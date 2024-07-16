
import java.util.HashSet;

public class Intersectionarr {
    public static int inter(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
         set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){//if it exist then return
                System.out.println(arr2[j]);//print unique element
               count++;
               set.remove(arr2[j]);
            }
        }
        
        return count;

    }
    public static void main(String[] args) {
        int x[]={1,6,9,9,8};
        int y[]={3,6,9,2,0};
        System.out.println(inter(x,y));
    }
}
