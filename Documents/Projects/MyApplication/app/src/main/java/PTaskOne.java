import java.util.Scanner;

public class PTaskOne {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
