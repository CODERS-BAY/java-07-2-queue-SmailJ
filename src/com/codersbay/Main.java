package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws QueueTooSmall {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int temp;

        System.out.println("1 = new number, 2 = list size, 3 = first number & delete it, 4 = delete some first numbers");
        int choose = sc.nextInt();
        do {
            if (choose == 1) {
                System.out.println("Enter the number");
                temp = sc.nextInt();
                queue.enqueue(temp);
            } else if (choose == 2) {
                System.out.println(queue.size());
            }  else if (choose == 3) {
                System.out.println(queue.dequeue());
            } else if (choose == 4) {
                System.out.println("How much you want to remove");
                temp = sc.nextInt();
                queue.dequeue(temp);
            } else {
                System.out.println("Incorrect");
            }

            System.out.println("1 = new number, 2 = list size, 3 = first number & delete it, 4 = delete some first numbers");
            choose = sc.nextInt();

        } while (!sc.equals("q"));

    }

}
