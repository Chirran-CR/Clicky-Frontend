import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static Scanner scn = new Scanner(System.in);
  
  public static int mikeAndExam(ArrayList<Integer> al,int idx,int n,int count,int k){
    if(idx == n){
      if(k == 0){
        count++;
      }
      return count;
    }
    if(k == 0){
      count++;
    }
    for(int i=al.size()-1;i>=0;i--){
      int elem = al.get(i);
      al.remove(i);
      mikeAndExam(al,idx+1,n,);
    }
  }
  public static void main(String args[]){
    int t = scn.nextInt();
    while(t-->0){
      int n = scn.nextInt();
      int k = scn.nextInt();
      ArrayList<Integer> al = new ArrayList<>();
      for(int i=0;i<n;i++){
        al.add(i,scn.nextInt());
      }
      mikeAndExam(al,0,n,0,k);
    }
  }
}




//-----------------------
import java.util.*;
import java.io.*;

public class Main {
  
  public static Scanner scn = new Scanner(System.in);
  
  public static int mikeAndExam(int[] a, int idx, int csf,  int tar){
    
    //base case
    if(idx == a.length){
      if(tar == 0){
        return csf+1;
      }
      // System.out.println("tar arr.length:"+tar);
      return csf;
    }
    //middle base case
    if(tar == 0){
    // System.out.println("tar:"+tar);
       csf += 1;
       return csf;
    }
    
    int rc1 = mikeAndExam(a,idx+1,csf,tar-a[idx]);
    int rc2 = mikeAndExam(a,idx+1,csf,tar+a[idx]);
    System.out.println(rc1+" "+rc2+" tar: "+tar);
    return rc1+rc2;
  }
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    int t = scn.nextInt();
    while(t-->0){
      int n = scn.nextInt();
      int k = scn.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
      }
      int totalCount=0;
      for(int i=0;i<n;i++){
        System.out.println("Call for idx:"+i);
        totalCount += mikeAndExam(a,i,0,k);
        System.out.println("totalCount:"+totalCount);
      }
      System.out.println(totalCount);
    }
    
  }
}