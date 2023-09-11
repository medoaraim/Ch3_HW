/*  Class: Month
    Abdul-Hameed Araim (Medo)
    Version: 1.0
    Course: ITEC 2140
    Date: September 11, 2023.
    This Class: Will output the month corresponding to the given
    number (will cycle back to january after passing december)
    ex: 14 would output February
    */
package Multibranching;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single digit number");
        int sDigit = sc.nextInt();
        sDigit = sDigit % 12;
        if (sDigit == 1) {
            System.out.println("January");
        } else if (sDigit == 2) {
            System.out.println("February");
        } else if (sDigit == 3) {
            System.out.println("March");
        } else if (sDigit == 4) {
            System.out.println("April");
        } else if (sDigit == 5) {
            System.out.println("May");
        } else if (sDigit == 6) {
            System.out.println("June");
        } else if (sDigit == 7) {
            System.out.println("July");
        } else if (sDigit == 8) {
            System.out.println("August");
        } else if (sDigit == 9) {
            System.out.println("September");
        } else if (sDigit == 10) {
            System.out.println("October");
        } else if (sDigit == 11) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }
    }
}
