import java.io.*;
import java.util.*;

public class Ten
{
	public static void main(String[] args) {
	    int[] arr=new int[10];//initializing array
	    arr[0]=0;
	    arr[1]=-1;
	    int isZero=0,isN_one=0;
	    for(int i=2;i<10;i++){
	        arr[i]=i;
	    }
	    for(int i=0;i<arr.length;i++){//checking for 0 and -1 in array
	        if(arr[i]==0){
	            isZero=1;
	        }
	        if(arr[i]==-1){
	            isN_one=1;
	        }
	    }
	    if(isZero==1 && isN_one==1){//displaying appropriate message if 0 and -1
	        System.out.println("Array has 0 and -1");
	    }
	    else if(isN_one==1){
	        System.out.println("Array has -1");
	    }
	    else if(isZero==1){
	        System.out.println("Array has 0");
	    }
}
}