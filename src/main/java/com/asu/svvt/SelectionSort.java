package com.asu.svvt;

public class SelectionSort {

    private int num = 1;

    void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minPos = indexOfMinimum(nums, i);
            swap(nums, i, minPos);
        }
    }

    private int indexOfMinimum(int[] nums, int i) {
        int minPos = i;
        for (; i < nums.length; ++i) {
            if (nums[i] < nums[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

    private void print(int[] nums){
        String s = "";
        for(int num : nums){
            s = s + num;
        }

        System.out.println(s);
    }


    public static void main(String[] args)
    {
        SelectionSort selectionSort = new SelectionSort();
        int[] nums = new int[]{3,6,1,8,9,4};

        selectionSort.sort(nums);

        System.out.println(nums.toString());

        selectionSort.print(nums);
    }
}
