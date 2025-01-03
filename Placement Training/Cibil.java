import java.util.Scanner;

public class Cibil{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
		boolean hasPan, hasGovId, hasGoodCibil;
		//inputs Read (or) after reading inputs
        System.out.println("Enter the details: ");
        hasPan  = sc.nextBoolean();
        hasGovId = sc.nextBoolean();
        hasGoodCibil = sc.nextBoolean();
		if(hasPan && hasGovId && hasGoodCibil){
			System.out.println("Eligible for loan");
		}
		else{
			System.out.println(" Not Eligible for loan");			
		}
		sc.close();
	}
}