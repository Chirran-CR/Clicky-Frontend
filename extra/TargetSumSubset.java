import java.util.Scanner;

public class TargetSumSubset{
    public static Scanner scn = new Scanner(System.in);

    public static boolean targetSumSubset(int[] arr, int idx, int tar){
        if(tar == 0){
            return true;
        }
        if(idx == arr.length){
            return false;
        }


        boolean rr1 = targetSumSubset(arr, idx+1, tar-arr[idx]);
        if(rr1) return rr1;
        else {
            boolean rr2 = targetSumSubset(arr, idx+1, tar);
            return rr2;
        }

    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(System.currentTimeMillis());
        System.out.println(targetSumSubset(arr,0,k));
        System.out.println(System.currentTimeMillis());
    }
}