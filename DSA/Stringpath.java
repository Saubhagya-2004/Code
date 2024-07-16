public class Stringpath {
    public static float shortroute(String route){
        int x=0;
        int y=0;
        for(int i=0;i<route.length();i++){
            char dir=route.charAt(i);
            if(dir=='N'){
                y++;

            }
           else if(dir=='S'){
                y--;
            }
           else if(dir=='E'){
            x++;

           }
           else if(dir=='W'){
            x--;
           }
          
        }
 float distance=(float)Math.sqrt(y*y + x*x);
 return distance;
   }
    public static void main(String[] args) {
        String route="WNEENESENN";
        String route2="NNN";
        System.out.println(shortroute(route2));
        System.out.print(shortroute(route));
    }
}
