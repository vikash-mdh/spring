package org.Excption_Handling;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number. ");
        int arr[] =  new int[5];

        int no = sc.nextInt();
        try{
            // this is the critical statement
            int ans = 10 /no;

            for(int i = 0; i <= 5; i++){
                arr[i] = i;
            }
        }catch (ArithmeticException e) {

            // handling the statemnet
           // e.printStackTrace();
          //  System.out.println(e.getStackTrace()); // line no nad other datails in that excption
            // System.out.println(e.getMessage());
            System.out.println("Don't enter 0 as value");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you are out of your limit");
        }catch(Exception e){
            System.out.println("Caugth the general excption");
        }
        //System.out.println("This is an important statement and should be printed");

    }
}