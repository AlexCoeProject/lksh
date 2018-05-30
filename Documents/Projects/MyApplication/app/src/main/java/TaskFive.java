import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;

/**
 * Created by alexander on 19/04/2018.
 */

public class TaskFive {

    public static void main(String[] args) throws IOException {
        File fout = new File("/Users/alexander/Documents/divide.out");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        File fin = new File("/Users/alexander/Documents/divide.in");
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        int n = Integer.parseInt(br.readLine());

        int slices[] = new int[n];
        int colors[] = new int[n+1];
        int colorsNew[] = new int[n+1];
        int stones[] = new int[n];
        int counter = 0;
        int slice;

            String[] values = br.readLine().split(" ");
            for(int c=0;c<n;c++) {
                slices[c] = Integer.parseInt(values[c]);
            }

        for(int i=0;i<n;i++){
            if(colors[slices[i]] == 0) {
                stones[i] = 1;
                colors[slices[i]] = 1;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(colorsNew[slices[i]] == 0) {
                if(stones[i] == 1) {
                    stones[i] = 0;
                } else {
                    stones[i] = 2;
                }
                colorsNew[slices[i]] = 1;
            }
        }


        slice = 0;
        for(int c=0;c<n;c++) {
            if(stones[c] == 1) {
                slice++;
            } else if(stones[c] == 2) {
                slice--;
            }
            if(slice == 0) {
                counter++;
            }
        }

        System.out.print(counter);
        bw.write(String.valueOf(counter));
        bw.flush();
        bw.close();

    }
}
