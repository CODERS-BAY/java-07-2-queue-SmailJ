package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Integer> ques = new ArrayList<>();

    public void enqueue(int newElement) {
        ques.add(newElement);
    }

    public int size() throws QueueTooSmall {
        if (ques.size() == 0){
            throw new QueueTooSmall("Error, empty list");
        }

        int listSize;
        listSize = ques.size();
        return listSize;
    }

    public int dequeue() {
        int firstNumber;
        firstNumber = ques.get(0);
        ques.remove(firstNumber);
        return firstNumber;
    }

    public int[] dequeue(int n) {
        int[] nums = new int[ques.size()];
        for (int i = 0; i < n; i++) {
            nums[i] = ques.get(0);
            ques.remove(0);
            System.out.println(nums[i] + " removed ");
        }
        return nums;
    }


}
