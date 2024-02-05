import java.io.*;
import java.util.*;
public class Two
{
	public static void main(String[] args) {
	    int[] arr=new int[10];
		for(int i=0;i<10;i++){//initializing array elements
		    arr[i]=i;
		}
		int position=-1,search=4;
		for(int i=0;i<10;i++){
		    if(arr[i]==search){//searching for index of search element
		        position=i;
		    }
		}
		System.out.println("Position of searched element "+position);//displaying position
	}
}