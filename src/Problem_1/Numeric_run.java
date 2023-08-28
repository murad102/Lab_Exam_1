package Problem_1;

import java.util.Scanner;

public class Numeric_run {
    public static void main(String[] args) {
        Numeric numeric = new Numeric();
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        numeric.result(x,n);
        double ans = numeric.getAns();
        System.out.println("Answer is "+ans);


    }
}
