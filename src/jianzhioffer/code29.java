package jianzhioffer;

import java.util.ArrayList;

public class code29 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution1(nums,6));
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k) {

        int[] heap = new int[k];
        System.arraycopy(input, 0, heap, 0, heap.length);

        for (int i = k/2-1; i >=0 ; i--) {
            adjustHeap(heap,i);

        }

        for (int i = k; i <input.length ; i++) {
            if (heap[0]>input[i]){
                heap[0] = input[i];
                adjustHeap(heap,0);
            }
        }
        ArrayList<Integer> res =new ArrayList<>();
        for (Integer i : heap){
            res.add(i);
        }
        return res;
    }

    private static void adjustHeap(int[] heap, int k) {
        for (int i = 2*k+1; i < heap.length; i= 2*i+1) {
            if (i+1<heap.length && heap[i+1]>heap[i]){
                i++;
            }
            if (heap[i]>heap[k]){
                swap(heap,i,k);
                k = i;
            }else {
                break;
            }
        }
    }


    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        int left = 0 , right = input.length-1;
        int index = getIndex(input,left,right);
        while (index != k){
            if (index> k){
                right = index;
            }else {
                left = index + 1;
            }
            index = getIndex(input,left,right);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i <= index; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private static int getIndex(int[] input, int left, int right) {
        int start = input[left];

        while (left<right){
            while (input[left]<start){
                left++;
            }
            while (input[right] > start){
                right--;
            }
            if (left<right){
                swap(input,left,right);
            }
        }
        return left;
    }

    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
