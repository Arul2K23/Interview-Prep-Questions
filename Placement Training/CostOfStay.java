import java.util.Scanner;

public class CostOfStay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        boolean hasConfirmation, isVIP, hasPBills;    
        age = sc.nextInt();
        hasConfirmation = sc.nextBoolean();
        isVIP = sc.nextBoolean();
        hasPBills = sc.nextBoolean();
        if((age >= 18) && (hasConfirmation || isVIP) && !(hasPBills)){
            System.out.println("Eligible for Special Offer");
        }
        else{
            System.out.println("Not Eligible for Special Offer");
        }
        sc.close();
    }
}
