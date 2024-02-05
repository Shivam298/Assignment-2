import java.io.*;
import java.util.*;

public class Eight
{
	public static void main(String[] args) {
	    int[] arr=new int[10];//declaring array
	    for(int i=0;i<10;i++){//initailizing array
	        arr[i]=i;
	    }
	    int max=-2;
	    int secondMax=-1;
	    for(int i=0;i<arr.length;i++){//computing largest and second largest number
	        if(max<arr[i]){
	            secondMax=max;
	            max=arr[i];
	        }
	    }
	    System.out.println("Second Largest number in array "+secondMax);//displaying second largest number
	}
}