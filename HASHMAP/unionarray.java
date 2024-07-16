import java.util.*;
public class unionarray {
    public static void union(int arr1[],int arr2[]){
      HashSet<Integer>set=new HashSet<>();//hashset is use to be found unique value
      for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
        
        
      }
      for(int j=0;j<arr2.length;j++){
        set.add(arr2[j]);
        
      }
      System.out.println(set.size());

      System.out.println(set);
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={3,4,2,7,8,1};
        union(arr1, arr2);
       
    }
}
