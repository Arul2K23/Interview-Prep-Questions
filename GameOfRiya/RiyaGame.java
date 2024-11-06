// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// System.out.println();
import java.util.*;
class RiyaGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num = 12397,res = 0;
        List<Integer> list  = new ArrayList<>();
        int length = String.valueOf(num).length()-1;
        System.out.println(length);
        while(num != 0){
            list.add(num%10);
            num = num /10;
            
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        for(int i : list){
            res += i * Math.pow(10, length);
            length -= 1;
        }
        System.out.println("Resultant number = " + res);
        sc.close();
    }
}