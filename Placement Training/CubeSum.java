import java.util.Scanner;

public class CubeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,sum = 0;
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println(m+" " +n);
        if(m > n){
            System.out.println("Can't calculate the sum!");
        }
        else{
            for(int i = m;i <= n;i++){
                sum = sum + (i*i*i);
            }
            System.out.println("Sum of the cubes is: "+sum);
        }
        sc.close();
    }
}
