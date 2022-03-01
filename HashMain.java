package com.bridgelab.hashtable;


public class HashMain {
	public static void main(String[] args) {
		System.out.println("welcome to hashtable programms");
		
		HashMapService HashMap1 = new HashMapService();
		String givenString = "To be or not to be";
		String[] myStr = givenString.toLowerCase().split(" ");
		for (String string : myStr){
			HashMap1.put(string, 1);
		}
		HashMap1.print();
		
		HashMapService hashMap2 = new HashMapService();
		String givenParagraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] myStr2 = givenParagraph.toLowerCase().split(" ");
		for (String string : myStr2) 
		{
			hashMap2.put(string, 1);
		}
		hashMap2.print();
	
		HashMapService hashMap3 = new HashMapService();
		String givenParagraph2= "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] myStr3 = givenParagraph2.toLowerCase().split(" ");
		for (String string : myStr3){
			hashMap3.put(string, 1);
		}
		hashMap3.remove("avoidable");
		hashMap3.print();
		}
}
