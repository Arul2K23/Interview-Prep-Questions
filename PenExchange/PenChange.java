// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// System.out.println();
import java.util.*;
class PenChange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,1,2,3};
        int count = 0;
        for(int i = 0;i < arr.length - 1; i++){
            if((arr[i] % 2 ==0 && arr[i+1] % 2 ==1) || (arr[i] % 2 ==1 && arr[i+1] % 2 ==0) ){
                count++;
            }
        }
        System.out.println("No.of Pen Changes = "+count);   
        sc.close();  
    }
}