import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        printFizzBuzz(100);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.

        Write a short program that prints each number from 1 to 100 on a new line.

For each multiple of 3, print "Fizz" instead of the number.

For each multiple of 5, print "Buzz" instead of the number.

For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.*/
    }
    public static void printFizzBuzz(int n) {
        //set program max to 100 and call method
        // if i%3 == 0 && i%5 == 0, print "Fizzbuzz"
        //if i%3 == 0, print "Fizz"
        //if i%% == 0, print "buzz"
        //else, print i

        for(int i = 1; i <= n; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}

