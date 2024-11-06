// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// System.out.println();
import java.util.*;
class FoodBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0,sum = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pizza" , 200);
        map.put("Burger" , 180);
        map.put("Dosa" , 80);
        map.put("Briyani" , 250);
        map.put("Idly" , 50);
        
        System.out.println(map);    
        choice = sc.nextInt();
        while(choice != 0){
            switch(choice){
                case 1:
                    sum += 200;
                    break;
                case 2:
                    sum += 180;
                    break;
                case 3:
                    sum += 80;
                    break;
                case 4:
                    sum += 50;
                    break;
                case 5:
                    sum += 250;
                    break;
                default:
                    break;
            }
            choice = sc.nextInt();
        }
        if(sum > 500){
            int dsum = 0;
            dsum = sum - ((int)(sum*0.10));
            System.out.println("Total Discounted Amount = "+ dsum);
        }
        else{
            System.out.println("Total Amount = "+ sum);
        }
        sc.close();   
    }
    
}