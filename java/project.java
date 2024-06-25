import java.util.Scanner;
public class project {
public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your age");
    int n=obj.nextInt();
    if(n>=18){
        System.out.println("You are eligible for voting");
    }
    else{
        System.out.println("You are not eligible for voting");
    }
    int Bjp,Bjd,Aap;
    while(n>=18){
        System.out.println("Enter 1 for Bjl");
        System.out.println("Enter 2 for Bjd");
        System.out.println("Enter 3 for  Aap");
        int choice=obj.nextInt();
        switch(choice){
            case 1:
            System.out.println("Press  1 for Bjp");
            Bjp=obj.nextInt();
            if(Bjp==1){
System.out.println("Voting added sucessfully");
            }
            else{
                System.out.println("Incorrect choice");
            }
            break;                                           
            case 2:
            System.out.println("Press 2 for Bjd");
            Bjd=obj.nextInt();
            if(Bjd==2){
                System.out.println("votting  added sucessfully");
            }
            else{
                System.out.println("Incorrect choice");
            }
            break;                                               //voting purpose
            case 3:
            System.out.println("Press 3 for Aap");
            Aap=obj.nextInt();
            if(Aap==3){
                System.out.println("Votting added sucessfully");
            }
            else{
                System.out.println("Incorrect choice");
            }
            break;
    
        }
        break;
        }
}
}

