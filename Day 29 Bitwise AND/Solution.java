import java.util.Scanner;
//bilakhiyaasif
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T, N, K;
        long j = 2, temp = j;
        long ans = 0;
        long and1 = 0;
        long i1 = 1;
        T = sc.nextLong();
        if (T >= 1 && T <= 10000) {
            for (long i = 0; i < T; i++) {
                N = sc.nextLong();
                K = sc.nextLong();

                // 1 2 3 4 5
                /*
                 * 1 2 1 3 1 4 1 5 2 3 2 4 2 5
                 */
                if (N >= 2 && N <= 10000 && K >= 2 && K <= N) {

                    while (j != (N + 1)) {
                        // System.out.println(i1+" "+j+" "+(i1&j));

                        and1 = i1 & j;
                        if ((and1 > ans) && (and1 < K)) {
                            ans = and1;
                        }

                        j++;

                        if (j == (N + 1)) {
                            temp++;
                            j = temp;
                            i1++;
                        }
                    }

                    System.out.println(ans);
                    j = 2;
                    temp = j;
                    ans = 0;
                    and1 = 0;
                    i1 = 1;
                }
            }
        }

    }
}

