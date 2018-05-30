import java.util.Scanner;

/**
 * Created by alexander on 22/04/2018.
 */

public class PTaskTwo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int number=0;
        int counter=1;
        int b = scan.nextInt();
        scan.nextLine();

        while(scan.hasNextInt()) {
            number = scan.nextInt();
            if(number == b) {
                counter = counter+1;
            }

            scan.nextLine();
        }
        System.out.print(counter);

    }
}
