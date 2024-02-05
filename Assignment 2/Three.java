import java.io.*;
import java.util.*;
public class Three
{
	public static void main(String[] args) {
	    int[] arr=new int[10];
		for(int i=0;i<10;i++){//initializing array elements
		    arr[i]=i;
		}
		int remove=4,index=0;
		int[] arrNew=new int[9];
		for(int i=0;i<10;i++){
		    if(arr[i]!=remove){//removing the specified element
		        arrNew[index++]=arr[i];
		    }
		}
		System.out.println("Array after removing the specifed element");//displaying new array
		for(int i=0;i<9;i++){
		    System.out.println(arrNew[i]);
		}
	}
}