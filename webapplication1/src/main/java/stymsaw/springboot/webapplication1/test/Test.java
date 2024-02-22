package stymsaw.springboot.webapplication1.test;

import java.util.Scanner;

public class Test {

    /*
    *
    * Write a function that takes an array of numbers as input
 and finds all the sequences present in the array.

Sequence is a set of 2 or more consecutive numbers.

e.g.
inp = [112, 320, 230, 431, 233, 231,432,232, 412, 598]
There are 2 sequences present in this array. 230, 231, 232, 233 and 431,432
Rest of the number do not form any sequence. So the output will be

output: [[230,231,232,233], [431,432]]
    *
    *
    *
    *
    *
    * */


    public static void main(String[] args) {


        int[] arr = {112, 320, 230, 431, 233, 231, 432, 232, 412, 598};


        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < i + 2; j++) {
                System.out.print(arr[i]+ " ");

            }
            System.out.println();

        }


    }

}
