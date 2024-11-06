import java.util.*;
class TicketBooking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age, qty, tot_price = 0;
        System.out.print("Enter The Required no. of tickets : ");
        qty = sc.nextInt();
        for(int i = 0; i< qty; i++){
            System.out.print("\n"+"Enter Age: ");
            age = sc.nextInt();
            if(age > 60)
                tot_price += 30;
            else if(age < 12)
                tot_price += 20;
            else
                tot_price += 50;
        }
        System.out.println("\n"+"Total Tickets = "+qty);
        System.out.println("Total amount = "+tot_price);
        sc.close();     
    }
}