import java.io.IOException;
import java.util.Scanner;

/**
 * Created by alexander on 22/04/2018.
 */

public class PTaskThree {
    public static void main(String args[]) throws IOException {
        Scanner br = new Scanner(System.in);
        String line;
        char chr;
        int counter = 0;

        line = br.nextLine();

        for(int i=0;i<line.length();i++) {
            chr = line.charAt(i);
            if(chr == '.' || chr == ';' || chr == '?'){
                counter++;
            }
        }
        System.out.println(counter);




    }
}
