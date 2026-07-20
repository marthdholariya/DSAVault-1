import java.util.Scanner;

public class PowerWithoutMul {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base and Power: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        //m and n are positive integers only...

        System.out.println("Answer is: "+function(n, m));

        sc.close();
    }

    static int function(int n, int m){
        int sum=0,a=n;;

        for (int i = 1; i < m; i++){

            sum=0;

            for (int j = 1; j <= n; j++) {
                
                sum = sum + a;

            }

            a=sum;
        }

        return sum;

    }
}