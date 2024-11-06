// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// System.out.println();
import java.util.*;
class EmptySeater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        String s = "";
        for(int i : arr){
            if(i % 2 ==0 ){
                s += String.valueOf(i)+"00";
            }
            else{
                s += String.valueOf(i)+"0";
            }
        }
        long temp = Long.valueOf(s);
        System.out.println(temp);
        sc.close();
    }
}