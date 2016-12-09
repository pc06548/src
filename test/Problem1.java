
package test;

import java.util.Arrays;
import java.util.List;



/**
 * Created by pcm1468 on 10/28/15.
 */
public class Problem1 {
    public static void main(String[]args) {
        int  [] A={
                1,2,3,4,1,2,3,4,2,0,0,0,0,0,2
        };
       System.out.print("-----"+solution(4,A));
    }


    private static int sol1(int n){
        if(n%2==0)
            return n-1;
        else return n/2+1;
    }

    protected void myMo(){}

    private static int solution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 0;
        int index = -1;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0 || index==-1) {
                int tmp = count[A[i]];
                if (tmp > maxOccurence || index==-1) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        for(int i =0;i<=M;i++)
        System.out.println(count[i]);
        return A[index];
    }

}

interface c{
    void myMo();
}
