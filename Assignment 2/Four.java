import java.io.*;
import java.util.*;
public class Four
{
	public static void main(String[] args) {
	    int[] arr=new int[10];
		for(int i=0;i<10;i++){//initializing array elements
		    arr[i]=i;
		}
		int insert=4,index=3,currIndex=0;
		int[] arrNew=new int[11];
		for(int i=0;i<index;i++){
		    arrNew[i]=arr[currIndex++];
		}
		arrNew[3]=insert;//inserting element at specified index
		for(int i=index+1;i<11;i++){
		    arrNew[i]=arr[currIndex++];
		}
		System.out.println("Array after inserting element at specified index");//displaying new array
		for(int i=0;i<11;i++){
		    System.out.println(arrNew[i]);
		}
	}
}