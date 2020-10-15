package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Integer> ques = new ArrayList<>();

    public void enqueue(int newElement) {
        ques.add(newElement);
    }

    public int size() {
        int listSize;
        listSize = ques.size();
        return listSize;
    }

    public int dequeue() throws QueueTooSmallException {
        if (ques.size() == 0){
            throw new QueueTooSmallException("Error, empty list");
        }
        int firstNumber;
        firstNumber = ques.get(0);
        ques.remove(0);
        return firstNumber;
    }

    public int[] dequeue(int n) throws QueueTooSmallException {
        if (ques.size() == 0){
            throw new QueueTooSmallException("Error, empty list");
        }
        int[] nums = new int[ques.size()];
        for (int i = 0; i < n; i++) {
            nums[i] = ques.get(0);
            ques.remove(0);
            System.out.println(nums[i] + " removed ");
        }
        return nums;
    }


}
