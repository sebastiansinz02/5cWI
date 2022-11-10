package Algodat;

import java.util.Scanner;

public class SchriftlichAddieren {
    public static void main(String[] args) {
        new SchriftlichAddieren().top();
    }

    void top() {

        String number1 = read("erste Zahl");
        String number2 = read("zweite Zahl");
        String summe = addieren(number1, number2);
        if (summe.length() > 1 && summe.charAt(0) == '0') {
            summe = summe.substring(1);
        }
        System.out.println("Summe = " + summe);
    }

    Scanner sc = new Scanner(System.in);

    String read(String was) {
        System.out.println("Bitte " + was + " eingeben: ");
        return sc.nextLine().trim();
    }

    String addieren(String a, String b) {
        String result = "";
        int anzZiffern = Math.max(a.length(), b.length());
        int leftover = 0;
        int pos = 1;
        while (pos <= anzZiffern + 1) {
            int zifferA = ziffer(a, pos);
            int zifferB = ziffer(b, pos);
            int sum = zifferA + zifferB + leftover;
            if (sum > 9) {
                leftover = sum / 10;
                sum = sum % 10;
            } else {
                leftover = 0;
            }
            result = ziffer(sum) + result;
            pos = pos + 1;
        }
        return result;
    }


    int ziffer(String zahlenString, int stelle) {
        int pos = zahlenString.length() - stelle;
        if (pos < 0) {
            return 0;
        }
        return zahlenString.charAt(pos) - '0';
    }


    String ziffer(int zahl) {
        if (zahl < 1) return "0";
        if (zahl > 9) return "X";
        return "" + zahl;
    }

}


