import java.io.*;
import java.util.*;

public class Seven
{
	public static void main(String[] args) {
	    int[] arr=new int[10];//declaring array
	    int[] brr=new int[10];//declaring array
	    for(int i=0;i<10;i++){//initailizing array
	        arr[i]=i;
	    }
	    for(int i=0;i<10;i++){//initailizing array
	        brr[i]=i;
	    }
	    int[] common=new int[10];
	    int index=0;
	    for(int i=0;i<arr.length;i++){//determining common values in both arrays
	        for(int j=0;j<brr.length;j++){
	            if(arr[i]==brr[j]){
	                common[index]=arr[i];
	                index++;
	            }
	        }
	    }
	    for(int i=0;i<index;i++){//displaying common values
	        System.out.println(common[i]);
	    }
	}
}