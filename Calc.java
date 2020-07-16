import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {

    public static void main(String[] args) throws IOException {
        int sum1=0, sum2=0, sum3=0, sum4=0;
        int qwe=0;

        int temp=0;

        int horizontal[] = new int[3];
        int vertical[] = new int[3];
        int diagonal1[] = new int[1];
        int diagonal2[] = new int[1];
        boolean magic = true;

        int A[][] = {
                {2, 9, 4},
                {7, 5, 3},
                {6, 1, 8}};

        //cout<<A[0][0]<<endl;
        //sum3=0;
        for (int i = 0; i < 3; i++) {
            sum3 += A[i][i];
            int e = A[1][1];
            //cout<<A[i][i]<<endl;
            qwe += A[i][i];

            //cout<<sum3<<endl;
            sum4 += A[i][3 - i - 1];
            for (int b = 0; b < 3; b++) {
                sum1 += A[i][b];
                sum2 += A[b][i];

            }
            //cout<<sum1<<endl;
            horizontal[i] = sum1;
            vertical[i] = sum2;
            //diagonal1[0] = sum3;

            //diagonal2[0] = sum4;
            sum1 = 0;
            sum2 = 0;
        }
        System.out.println(qwe);
    }
}