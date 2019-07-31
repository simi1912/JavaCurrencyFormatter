import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        String us = US.format(payment);

        NumberFormat India = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = India.format(payment);

        NumberFormat China = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = China.format(payment);

        NumberFormat France = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = France.format(payment);5

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
         System.out.println("France: " + france);
    }
}

