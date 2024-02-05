import java.io.*;
import java.util.*;

public class Nine
{
	public static void main(String[] args) {
	    int[] arr={1,2,4,5};//initializing array
	    int currSum=0,actualSum=0,length;
	    length=arr.length+1;
	    actualSum=length*(length+1)/2;
	    for(int i=0;i<arr.length;i++){//caluclating sum of array
	        currSum+=arr[i];
	    }
	    System.out.println("Missing Element "+(actualSum-currSum));//dispalying missing elemeny after computation
}
}