import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collection;

import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        // if(N>=2 && N<=30)
        // {
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // String regx_name="^([a-z]+)$";
        String regx_email = ".+@gmail\\.com$";

        // Pattern r=Pattern.compile(regx_name);
        Pattern r2 = Pattern.compile(regx_email);
        // String name_arr[]=new String[N];
        // String email_arr[]=new String[N];
        ArrayList<String> l1 = new ArrayList<>();

        // int z=0;
        for (int NItr = 0; NItr < N; NItr++) {
            // String[] firstNameEmailID = scanner.nextLine().split(" ");
            // String firstName = firstNameEmailID[0];
            String firstName = scanner.next();
            String emailID = scanner.next();
            // String emailID = firstNameEmailID[1];
            // Matcher m=r.matcher(firstName);
            Matcher m2 = r2.matcher(emailID);
            if (m2.find()) {
                // name_arr[z]=firstName;
                // email_arr[z]=emailID;
                // z++;
                l1.add(firstName);
            }
        }
        // z=0;

        /*
         * for(int i=0;i<name_arr.length;i++) { if(name_arr[i]==null) { break; } else {
         * for(int j=i+1;j<name_arr.length;j++) { if(name_arr[j]==null) { break; }
         * if(name_arr[i].compareTo(name_arr[j])>0 ) { String temp1=name_arr[i]; String
         * temp2=email_arr[i];
         * 
         * name_arr[i]=name_arr[j]; email_arr[i]=email_arr[j];
         * 
         * name_arr[j]=temp1; email_arr[j]=temp2;
         * 
         * } } } } String test123[]=new String[N]; int test123_cnt=0; for(int
         * i=0;i<name_arr.length;i++) { if(name_arr[i]==null) { break; } String
         * tem1[]=email_arr[i].split("@");
         * 
         * if(tem1[1].equals("gmail.com")) { if( uniq1(email_arr[i],test123) ) {
         * System.out.println(name_arr[i]); test123[test123_cnt++]=email_arr[i]; } else{
         * 
         * } }
         * 
         * } scanner.close(); // } } public static boolean uniq1(String s1,String
         * arr1[]) { for(int i=0;i<arr1.length;i++) { if(arr1[i]==null) { break; } else
         * if(arr1[i].equals(s1)) { return false; } } return true;
         */

        Collections.sort(l1);
        for (String fname : l1) {
            System.out.println(fname);
        }

    }
}
