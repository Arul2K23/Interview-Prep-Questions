import java.util.*;

class SumOfCubes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get values of m and n as inputs from user
        int m = sc.nextInt();
        int n = sc.nextInt();
        // init sum value
        int sum = 0;
        for(int i = m;i < n;i++){//Enter for loop only when the value of m is less than n
            sum += Math.pow(i,3); // sum value is computed
        }
        System.out.println("Sum = "+sum); // sum alue is written into the output
        sc.close();
    }
}