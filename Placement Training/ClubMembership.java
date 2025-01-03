import java.util.Scanner;

public class ClubMembership {
    public static void main(String[] args) {
        boolean certified, hasGoodAB, participatedEvents;
        Scanner sc = new Scanner(System.in);
        certified = sc.nextBoolean();
        hasGoodAB = sc.nextBoolean();
        participatedEvents = sc.nextBoolean();
        if(certified || hasGoodAB || participatedEvents){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
        sc.close();
    }
}
