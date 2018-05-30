import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.BufferedWriter;

/**
 * Created by alexander on 19/04/2018.
 */

public class TaskSeven {


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("/Users/alexander/Documents/Projects/MyApplication/app/src/main/java/com/example/alexander/myapplication/down-up.in"));
        File fout = new File("/Users/alexander/Documents/Projects/MyApplication/app/src/main/java/com/example/alexander/myapplication/down-up.out");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        int r = scan.nextInt();
        int c = scan.nextInt();
        int chipI, chipJ, daleI, daleJ;
        int feild[][] = new int[r][c];
        int paths[][] = new int[r][c];
        int coord[][] = new int[100000][3];

        scan.nextLine();

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                feild[i][j] = scan.nextInt();
            }
            scan.nextLine();
        }

        chipI = scan.nextInt()-1;
        chipJ = scan.nextInt()-1;
        scan.nextLine();
        daleI = scan.nextInt()-1;
        daleJ = scan.nextInt()-1;
        boolean end;


        int meetUpI = 0;
        int meetUpJ = 0;
        int stepsSum = 0;
        int maxSteps = 10000;
        int fl= 0;
        int pr= 0;
        int fr= 0;
        int pu= 0;
        int fu= 0;
        int pd= 0;
        int fd= 0;
        int pl = 0;
        int di,dj;

        paths[chipI][chipJ] = -1;
        paths[daleI][daleJ] = 1;

        coord[0][0] = 1; coord[0][ 1] = daleI; coord[0][2] = daleJ;

        coord[1][0] = -1; coord[0][ 1] = chipI; coord[0][2] = chipJ;

        int begin = 0;

        int newend = 1;

        if(chipI == daleI && chipJ == daleJ) {
            meetUpI++;
            meetUpJ++;
            bw.write(String.valueOf(stepsSum));
            bw.newLine();
            bw.write(meetUpI + " " + meetUpJ);
        } else {

            for (int s = 1; s < maxSteps; s++) {
                end = false;
                for (int dd = 0; dd < c; dd++) {
                    di = coord[dd][ 1];
                    dj = coord[dd][ 2];
                        if (paths[di][dj] == s) {

                            if(!(dj - 1 < 0)) {
                                pl = paths[di][dj - 1];
                                fl = feild[di][dj - 1];
                            }

                            if(!(dj + 1 >= c)) {
                                pr = paths[di][dj + 1];
                                fr = feild[di][dj + 1];
                            }

                            if(!(di - 1 < 0)) {
                                 pu = paths[di - 1][dj];
                                 fu = feild[di - 1][dj];
                            }
                            if(!(di + 1 >= r)) {
                                 pd = paths[di + 1][dj];
                                 fd = feild[di + 1][dj];
                            }

                            int p = paths[di][dj];
                            int f = feild[di][dj];

                            end = true;
                            if (!(di + 1 >= r) && f >= fd) {
                                if (pd < 0) {
                                    stepsSum = s;
                                    meetUpI = di + 1;
                                    meetUpJ = dj;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pd == 0) {
                                    paths[di+1][dj] = s + 1;
                                    coord[newend][0] = s + 1; coord[newend][ 1] = di+1; coord[newend][2] = dj; newend++;
                                }
                            }

                            if (!(di - 1 < 0) && f >= fu) {
                                if (pu < 0) {
                                    stepsSum = s;
                                    meetUpI = di - 1;
                                    meetUpJ = dj;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pu == 0) {
                                    paths[di-1][dj] = s + 1;
                                    coord[newend][0] = s + 1; coord[newend][ 1] = di-1; coord[newend][2] = dj; newend++;
                                }
                            }

                            if (!(dj + 1 >= c) && f >= fr) {
                                if (pr < 0) {
                                    stepsSum = s;
                                    meetUpI = di;
                                    meetUpJ = dj + 1;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pr == 0) {
                                    paths[di][dj+1] = s + 1;
                                    coord[newend][0] = s + 1; coord[newend][ 1] = di; coord[newend][2] = dj+1; newend++;
                                }
                            }

                            if (!(dj - 1 < 0) && f >= fl) {
                                if (pl < 0) {
                                    stepsSum = s;
                                    meetUpI = di;
                                    meetUpJ = dj - 1;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pl == 0) {
                                    paths[di][dj-1] = s + 1;
                                    coord[newend][0] = s + 1; coord[newend][ 1] = di; coord[newend][2] = dj-1; newend++;
                                }
                            }
                        }


                        if (paths[di][dj] == s * -1) {
                            if(!(dj - 1 < 0)) {
                                pl = paths[di][dj - 1];
                                fl = feild[di][dj - 1];
                            }

                            if(!(dj + 1 >= c)) {
                                pr = paths[di][dj + 1];
                                fr = feild[di][dj + 1];
                            }

                            if(!(di - 1 < 0)) {
                                pu = paths[di - 1][dj];
                                fu = feild[di - 1][dj];
                            }
                            if(!(di + 1 >= r)) {
                                pd = paths[di + 1][dj];
                                fd = feild[di + 1][dj];
                            }

                            int p = paths[di][dj];
                            int f = feild[di][dj];

                            end = true;
                            if (!(di + 1 >= r) && f <= fd) {
                                if (pd > 0) {
                                    stepsSum = s;
                                    meetUpI = di + 1;
                                    meetUpJ = dj;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pd == 0) {
                                    paths[di+1][dj] = (s + 1) * -1;
                                    coord[newend][0] =  (s + 1) * -1; coord[newend][ 1] = di+1; coord[newend][2] = dj; newend++;
                                }
                            }

                            if (!(di - 1 < 0) && f <= fu) {
                                if (pu > 0) {
                                    stepsSum = s;
                                    meetUpI = di - 1;
                                    meetUpJ = dj;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pu == 0) {
                                    paths[di-1][dj] = (s + 1) * -1;
                                    coord[newend][0] =  (s + 1) * -1; coord[newend][ 1] = di-1; coord[newend][2] = dj; newend++;
                                }
                            }

                            if (!(dj + 1 >= c) && f <= fr) {
                                if (paths[di][dj + 1] > 0) {
                                    stepsSum = s;
                                    meetUpI = di;
                                    meetUpJ = dj + 1;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pr == 0) {
                                    paths[di][dj+1] = (s + 1) * -1;
                                    coord[newend][0] =  (s + 1) * -1; coord[newend][ 1] = di; coord[newend][2] = dj+1; newend++;
                                }
                            }

                            if (!(dj - 1 < 0) && f <= fl) {
                                if (pl > 0) {
                                    stepsSum = s;
                                    meetUpI = di;
                                    meetUpJ = dj - 1;
                                    s = maxSteps;
                                    di = r;
                                    dj = c;
                                    break;
                                } else if (pl == 0) {
                                    paths[di][dj-1] = (s + 1) * -1;
                                    coord[newend][0] =  (s + 1) * -1; coord[newend][ 1] = di; coord[newend][2] = dj-1; newend++;
                                }
                            }
                        }
                    if (end == false) {
                        s = maxSteps;
                        break;
                    }
                    }
                }



            if (stepsSum == 0) {
                int neg = -1;
                bw.write(String.valueOf(neg));
            } else {
                meetUpI++;
                meetUpJ++;
                bw.write(String.valueOf(stepsSum));
                bw.newLine();
                bw.write(meetUpI + " " + meetUpJ);
            }
        }
        bw.close();

    }
}