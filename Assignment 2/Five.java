import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr=new int[10];
		for(int i=0;i<10;i++){//initializing array elements
		    arr[i]=i;
		}
		int max=-1,min=1000;
		for(int i=0;i<10;i++){//calculating minimum and maximum element in array
		    if(arr[i]<min){
		        min=arr[i];
		    }
		    if(max<arr[i]){
		        max=arr[i];
		    }
		}
		System.out.println("Minimum element in array "+min);//displaying minimum element
		System.out.println("Maximum element in array "+max);//diplaying maximum element	
	}
}