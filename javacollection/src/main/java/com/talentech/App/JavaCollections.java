package com.talentech.App;

import org.omg.Messaging.SyncScopeHelper;

public class JavaCollections {

	public void reverseArray(){
		
		int revArray[] = {8,4,1,9,6};
		
		int arrayLen = revArray.length;
		System.out.println("Length of the Array is: "+arrayLen);
		
		for (int i=0; i<arrayLen/2;i++){
			int temp=revArray[i];
			revArray[i]=revArray[arrayLen-1-i];
			revArray[arrayLen-1-i]=temp;
		} //end of for loop
		
		System.out.print("Reversed Array: ");
		for(int x=0;x<arrayLen; x++){
			System.out.print(revArray[x]);
		}
		System.out.println();
		
	} //end of the reverseArray method
	
	public void reverseString(){
		String s="Talentech";
		int sLen=s.length();
		for(int i=(sLen-1);i>=0;i--){
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("_________________________________________");
	}
	
	
	public void oddEvenArray(){
		
		int count1=0, count2=0;
		int oeArray[] = {1,2,5,7,20,25,30,73,13};
		System.out.println("Numbers in the Array:1,2,5,7,20,25,30,73,13");
		int oeLen=oeArray.length;
		System.out.println("The length of Odd/Even Arrys is: "+oeLen);
		for (int x=0;x<oeLen;x++){
			if(oeArray[x]%2==0){
				System.out.println(oeArray[x]+" is an even number");
				count1++;
			}
			
			else {
				System.out.println(oeArray[x]+" is an odd number");
				count2++;
			}
				
		}//end of for loop
		
		System.out.println("Count of Even Numbers: "+count1);
		System.out.println("Count of Odd Numbers: "+count2);
		
	}   // end of oddEvenArray method
	
}//end of class

