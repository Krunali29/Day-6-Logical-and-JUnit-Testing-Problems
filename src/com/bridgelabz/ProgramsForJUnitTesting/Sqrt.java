package com.bridgelabz.ProgramsForJUnitTesting;
//Programs for J Unit Testing
//Que.5
//Write a static function sqrt to compute the square root of a non negative number c given in the input using Newton's method:
import java.util.Scanner;
public class Sqrt
{
    public static void main(String[] args) throws Exception {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("enter no to find square root");
            double c = s.nextDouble();
            System.out.println("square root is " + Util.sqrt(c));
            s.close();
        } catch (Exception e) {
            System.out.println("inter integer value "+e.getMessage());
        }

    }
}
