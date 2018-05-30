import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;

/**
 * Created by alexander on 19/04/2018.
 */

public class TaskSix {


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("/Users/alexander/Documents/Projects/MyApplication/app/src/main/java/com/example/alexander/myapplication/divisor.in"));
        File fout = new File("/Users/alexander/Documents/Projects/MyApplication/app/src/main/java/com/example/alexander/myapplication/divisor.out");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        int sweets1 = scan.nextInt();
        int result[][] = new int[1000][20];
        int variants = 0;
        int eats = 1000;


        for(int i1=2;i1<=sweets1;i1++){
            if(sweets1 % i1 == 0) {
              int sweets2 = (sweets1 / i1) * (i1-1);

                if(sweets2 == 1) {
                    if(eats > 1)
                        eats = 1;

                    result[variants][0] = sweets1 / i1;
                    variants++;
                    break;
                }
                if(eats <= 1)
                    break;

                for(int i2=2;i2<=sweets2;i2++){
                    if(sweets2 % i2 == 0) {
                       int sweets3 = (sweets2 / i2) * (i2-1);

                        if(sweets3 == 1) {
                            if(eats > 2)
                                eats = 2;

                            result[variants][0] = sweets1 / i1;
                            result[variants][1] = sweets2 /i2;
                            variants++;
                            break;
                        }
                        if(eats <= 2)
                            break;

                        for(int i3=2;i3<=sweets3;i3++){
                            if(sweets3 % i3 == 0) {
                                int sweets4 = (sweets3 / i3) * (i3-1);

                                if(sweets4 == 1) {
                                    if(eats > 3)
                                        eats = 3;

                                    result[variants][0] = sweets1 / i1;
                                    result[variants][1] = sweets2 /i2;
                                    result[variants][2] = sweets3 /i3;
                                    variants++;
                                    break;
                                }
                                if(eats <= 3)
                                    break;

                                for(int i4=2;i4<=sweets4;i4++){
                                    if(sweets4 % i4 == 0) {
                                        int sweets5 = (sweets4 / i4) * (i4-1);

                                        if(sweets5 == 1) {
                                            if(eats > 4)
                                                eats = 4;

                                            result[variants][0] = sweets1 / i1;
                                            result[variants][1] = sweets2 /i2;
                                            result[variants][2] = sweets3 /i3;
                                            result[variants][3] = sweets4 /i4;
                                            variants++;
                                            break;
                                        }
                                        if(eats <= 4)
                                            break;

                                        for(int i5=2;i5<=sweets5;i5++){
                                            if(sweets5 % i5 == 0) {
                                                int sweets6 = (sweets5 / i5) * (i5-1);

                                                if(sweets6 == 1) {
                                                    if(eats > 5)
                                                        eats = 5;

                                                    result[variants][0] = sweets1 /i1;
                                                    result[variants][1] = sweets2 /i2;
                                                    result[variants][2] = sweets3 /i3;
                                                    result[variants][3] = sweets4 /i4;
                                                    result[variants][4] = sweets5 /i5;
                                                    variants++;
                                                    break;
                                                }
                                                if(eats <= 5)
                                                    break;

                                                for(int i6=2;i6<=sweets6;i6++){
                                                    if(sweets6 % i6 == 0) {
                                                        int sweets7 = (sweets6 / i6) * (i6-1);

                                                        if(sweets7 == 1) {
                                                            if(eats > 6)
                                                                eats = 6;

                                                            result[variants][0] = sweets1 /i1;
                                                            result[variants][1] = sweets2 /i2;
                                                            result[variants][2] = sweets3 /i3;
                                                            result[variants][3] = sweets4 /i4;
                                                            result[variants][4] = sweets5 /i5;
                                                            result[variants][5] = sweets6 /i6;
                                                            variants++;
                                                            break;
                                                        }
                                                        if(eats <= 6)
                                                            break;

                                                        for(int i7=2;i7<=sweets7;i7++){
                                                            if(sweets7 % i7 == 0) {
                                                                int sweets8 = (sweets7 / i7) * (i7-1);

                                                                if(sweets8 == 1) {
                                                                    if(eats > 7)
                                                                        eats = 7;

                                                                    result[variants][0] = sweets1 /i1;
                                                                    result[variants][1] = sweets2 /i2;
                                                                    result[variants][2] = sweets3 /i3;
                                                                    result[variants][3] = sweets4 /i4;
                                                                    result[variants][4] = sweets5 /i5;
                                                                    result[variants][5] = sweets6 /i6;
                                                                    result[variants][6] = sweets7 /i7;
                                                                    variants++;
                                                                    break;
                                                                }
                                                                if(eats <= 7)
                                                                    break;

                                                                for(int i8=2;i8<=sweets8;i8++){
                                                                    if(sweets8 % i8 == 0) {
                                                                        int sweets9 = (sweets8 / i8) * (i8-1);

                                                                        if(sweets9 == 1) {
                                                                            if(eats > 8)
                                                                                eats = 8;

                                                                            result[variants][0] = sweets1 /i1;
                                                                            result[variants][1] = sweets2 /i2;
                                                                            result[variants][2] = sweets3 /i3;
                                                                            result[variants][3] = sweets4 /i4;
                                                                            result[variants][4] = sweets5 /i5;
                                                                            result[variants][5] = sweets6 /i6;
                                                                            result[variants][6] = sweets7 /i7;
                                                                            result[variants][7] = sweets8 /i8;
                                                                            variants++;
                                                                            break;
                                                                        }
                                                                        if(eats <= 8)
                                                                            break;

                                                                        for(int i9=2;i9<=sweets9;i9++){
                                                                            if(sweets9 % i9 == 0) {
                                                                                int sweets10 = (sweets9 / i9) * (i9-1);

                                                                                if(sweets10 == 1) {
                                                                                    if(eats > 9)
                                                                                        eats = 9;

                                                                                    result[variants][0] = sweets1 /i1;
                                                                                    result[variants][1] = sweets2 /i2;
                                                                                    result[variants][2] = sweets3 /i3;
                                                                                    result[variants][3] = sweets4 /i4;
                                                                                    result[variants][4] = sweets5 /i5;
                                                                                    result[variants][5] = sweets6 /i6;
                                                                                    result[variants][6] = sweets7 /i7;
                                                                                    result[variants][7] = sweets8 /i8;
                                                                                    result[variants][8] = sweets9 /i9;
                                                                                    variants++;
                                                                                    break;
                                                                                }

                                                                                if(eats <= 9)
                                                                                    break;

                                                                                for(int i10=2;i10<=sweets10;i10++){
                                                                                    if(sweets10 % i10 == 0) {
                                                                                        int sweets11 = (sweets10 / i10) * (i10-1);

                                                                                        if(sweets11 == 1) {
                                                                                            if(eats > 10)
                                                                                                eats = 10;

                                                                                            result[variants][0] = sweets1 /i1;
                                                                                            result[variants][1] = sweets2 /i2;
                                                                                            result[variants][2] = sweets3 /i3;
                                                                                            result[variants][3] = sweets4 /i4;
                                                                                            result[variants][4] = sweets5 /i5;
                                                                                            result[variants][5] = sweets6 /i6;
                                                                                            result[variants][6] = sweets7 /i7;
                                                                                            result[variants][7] = sweets8 /i8;
                                                                                            result[variants][8] = sweets9 /i9;
                                                                                            result[variants][9] = sweets10 /i10;
                                                                                            variants++;
                                                                                            break;
                                                                                        }

                                                                                        if(eats <= 10)
                                                                                            break;

                                                                                        for(int i11=2;i11<=sweets11;i11++){
                                                                                            if(sweets11 % i11 == 0) {
                                                                                                int sweets12 = (sweets11 / i11) * (i11-1);

                                                                                                if(sweets12 == 1) {
                                                                                                    if(eats > 11)
                                                                                                        eats = 11;

                                                                                                    result[variants][0] = sweets1 /i1;
                                                                                                    result[variants][1] = sweets2 /i2;
                                                                                                    result[variants][2] = sweets3 /i3;
                                                                                                    result[variants][3] = sweets4 /i4;
                                                                                                    result[variants][4] = sweets5 /i5;
                                                                                                    result[variants][5] = sweets6 /i6;
                                                                                                    result[variants][6] = sweets7 /i7;
                                                                                                    result[variants][7] = sweets8 /i8;
                                                                                                    result[variants][8] = sweets9 /i9;
                                                                                                    result[variants][9] = sweets10 /i10;
                                                                                                    result[variants][10] = sweets11 /i11;
                                                                                                    variants++;
                                                                                                    break;
                                                                                                }

                                                                                                if(eats <= 11)
                                                                                                    break;

                                                                                                for(int i12=2;i12<=sweets12;i12++){
                                                                                                    if(sweets12 % i12 == 0) {
                                                                                                        int sweets13 = (sweets12 / i12) * (i12-1);

                                                                                                        if(sweets13 == 1) {
                                                                                                            if(eats > 12)
                                                                                                                eats = 12;

                                                                                                            result[variants][0] = sweets1 /i1;
                                                                                                            result[variants][1] = sweets2 /i2;
                                                                                                            result[variants][2] = sweets3 /i3;
                                                                                                            result[variants][3] = sweets4 /i4;
                                                                                                            result[variants][4] = sweets5 /i5;
                                                                                                            result[variants][5] = sweets6 /i6;
                                                                                                            result[variants][6] = sweets7 /i7;
                                                                                                            result[variants][7] = sweets8 /i8;
                                                                                                            result[variants][8] = sweets9 /i9;
                                                                                                            result[variants][9] = sweets10 /i10;
                                                                                                            result[variants][10] = sweets11 /i11;
                                                                                                            result[variants][11] = sweets12 /i12;
                                                                                                            variants++;
                                                                                                            break;
                                                                                                        }

                                                                                                        if(eats <= 12)
                                                                                                            break;

                                                                                                        for(int i13=2;i13<=sweets13;i13++){
                                                                                                            if(sweets13 % i13 == 0) {
                                                                                                                int sweets14 = (sweets13 / i13) * (i13-1);

                                                                                                                if(sweets14 == 1) {
                                                                                                                    if(eats > 13)
                                                                                                                        eats = 13;

                                                                                                                    result[variants][0] = sweets1 /i1;
                                                                                                                    result[variants][1] = sweets2 /i2;
                                                                                                                    result[variants][2] = sweets3 /i3;
                                                                                                                    result[variants][3] = sweets4 /i4;
                                                                                                                    result[variants][4] = sweets5 /i5;
                                                                                                                    result[variants][5] = sweets6 /i6;
                                                                                                                    result[variants][6] = sweets7 /i7;
                                                                                                                    result[variants][7] = sweets8 /i8;
                                                                                                                    result[variants][8] = sweets9 /i9;
                                                                                                                    result[variants][9] = sweets10 /i10;
                                                                                                                    result[variants][10] = sweets11 /i11;
                                                                                                                    result[variants][11] = sweets12 /i12;
                                                                                                                    result[variants][12] = sweets13 /i13;
                                                                                                                    variants++;
                                                                                                                    break;
                                                                                                                }

                                                                                                                if(eats <= 13)
                                                                                                                    break;

                                                                                                                for(int i14=2;i14<=sweets14;i14++){
                                                                                                                    if(sweets14 % i14 == 0) {
                                                                                                                        int sweets15 = (sweets14 / i14) * (i14-1);

                                                                                                                        if(sweets15 == 1) {
                                                                                                                            if(eats > 14)
                                                                                                                                eats = 14;

                                                                                                                            result[variants][0] = sweets1 /i1;
                                                                                                                            result[variants][1] = sweets2 /i2;
                                                                                                                            result[variants][2] = sweets3 /i3;
                                                                                                                            result[variants][3] = sweets4 /i4;
                                                                                                                            result[variants][4] = sweets5 /i5;
                                                                                                                            result[variants][5] = sweets6 /i6;
                                                                                                                            result[variants][6] = sweets7 /i7;
                                                                                                                            result[variants][7] = sweets8 /i8;
                                                                                                                            result[variants][8] = sweets9 /i9;
                                                                                                                            result[variants][9] = sweets10 /i10;
                                                                                                                            result[variants][10] = sweets11 /i11;
                                                                                                                            result[variants][11] = sweets12 /i12;
                                                                                                                            result[variants][12] = sweets13 /i13;
                                                                                                                            result[variants][13] = sweets14 /i14;
                                                                                                                            variants++;
                                                                                                                            break;
                                                                                                                        }

                                                                                                                        if(eats <= 14)
                                                                                                                            break;

                                                                                                                        for(int i15=2;i15<=sweets15;i15++){
                                                                                                                            if(sweets15 % i15 == 0) {
                                                                                                                                int sweets16 = (sweets15 / i15) * (i15-1);

                                                                                                                                if(sweets16 == 1) {
                                                                                                                                    if(eats > 15)
                                                                                                                                        eats = 15;

                                                                                                                                    result[variants][0] = sweets1 /i1;
                                                                                                                                    result[variants][1] = sweets2 /i2;
                                                                                                                                    result[variants][2] = sweets3 /i3;
                                                                                                                                    result[variants][3] = sweets4 /i4;
                                                                                                                                    result[variants][4] = sweets5 /i5;
                                                                                                                                    result[variants][5] = sweets6 /i6;
                                                                                                                                    result[variants][6] = sweets7 /i7;
                                                                                                                                    result[variants][7] = sweets8 /i8;
                                                                                                                                    result[variants][8] = sweets9 /i9;
                                                                                                                                    result[variants][9] = sweets10 /i10;
                                                                                                                                    result[variants][10] = sweets11 /i11;
                                                                                                                                    result[variants][11] = sweets12 /i12;
                                                                                                                                    result[variants][12] = sweets13 /i13;
                                                                                                                                    result[variants][13] = sweets14 /i14;
                                                                                                                                    result[variants][14] = sweets15 /i15;
                                                                                                                                    variants++;
                                                                                                                                    break;
                                                                                                                                }

                                                                                                                                if(eats <= 15)
                                                                                                                                    break;

                                                                                                                                for(int i16=2;i16<=sweets16;i16++){
                                                                                                                                    if(sweets16 % i16 == 0) {
                                                                                                                                        int sweets17 = (sweets16 / i16) * (i16-1);



                                                                                                                                    }
                                                                                                                                }

                                                                                                                            }

                                                                                                                            }
                                                                                                                        }

                                                                                                                    }
                                                                                                                }

                                                                                                            }
                                                                                                        }

                                                                                                    }
                                                                                                }

                                                                                            }
                                                                                        }


                                                                                    }
                                                                                }

                                                                            }
                                                                        }

                                                                    }
                                                                }

                                                            }
                                                        }

                                                    }
                                                }

                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                }

            }

        for(int i=0;i<variants;i++){
            for(int j=0;j<20;j++) {
                System.out.print(" " + result[i][j]);
            }
            System.out.println();
        }

    }
}