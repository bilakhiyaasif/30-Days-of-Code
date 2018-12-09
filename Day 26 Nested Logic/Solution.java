import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        int eday, emonth, eyear, aday1, amonth1, ayear1;
        Scanner sc = new Scanner(System.in);
        // ACT_RETURN DAY
        // EXP_RETURN DAY1
        int fine = 0;

        aday1 = sc.nextInt();
        amonth1 = sc.nextInt();
        ayear1 = sc.nextInt();

        eday = sc.nextInt();
        emonth = sc.nextInt();
        eyear = sc.nextInt();

        // 31 12 3000
        int ch1 = 0;

        /*if (eday >= 1 && eday <= 31 && emonth >= 1 && emonth <= 12 && eyear >= 1 && eyear <= 3000 && aday1 >= 1
                && aday1 <= 31 && amonth1 >= 1 && amonth1 <= 12 && ayear1 >= 1 && ayear1 <= 3000) */
              {
            // no fine on or before exp
            // 9 6 2015 a
            // 6 6 2015 e

            if (ayear1 <= eyear) {
                if (amonth1 <= emonth) {
                    if (aday1 <= eday) {

                        ch1 = 1;
                    }
                }
            }
            // 21 13

            if (ayear1 == eyear) {
                if (amonth1 == emonth) {
                    if (aday1 > eday) {

                        ch1 = 2;
                    }
                }
            }
            // fine after exp day
            if (ayear1 == eyear) {
                if (amonth1 > emonth) {

                    ch1 = 3;
                }
            }
            // fine after exp day
            if (ayear1 > eyear) {

                ch1 = 4;

            }
            switch (ch1) {
            case 1:
                fine = 0;
                break;
            case 2:
                fine = 15 * (aday1 - eday);
                break;
            case 3:
                fine = 500 * (amonth1 - emonth);
                break;
            case 4:
                fine = 10000;
                break;
            default:

            }

            System.out.println(fine);

        }

    }
}
