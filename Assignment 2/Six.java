import java.io.*;
import java.util.*;

public class Six
{
	public static void main(String[] args) {
	    String[] arr={"hello","hello","abcd","abcd","hi"};//initializing string array
	    for(int i=0;i<arr.length-1;i++){//checking for duplicate values
	        for(int j=i+1;j<arr.length;j++){
	            if(arr[i].equals(arr[j])){
	                System.out.println(arr[i]+" ");//displaying duplicate value
	            }
	        }
	    }
	}
}