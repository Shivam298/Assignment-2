import java.io.*;
import java.util.*;
public class One
{
	public static void main(String[] args) {
	    int[] arr=new int[10];
		for(int i=0;i<10;i++){//initializing array elements
		    arr[i]=i;
		}
		int sum=0;
		float average;
		for(int i=0;i<arr.length;i++){//calculating sum
		    sum+=arr[i];
		}
		average=sum/arr.length;//calculating average
		System.out.println("Sum "+sum);//displaying summ
		System.out.println("Average "+average);//displaying average
	}
}