package com.bridgelab.hashtable;


public class HashMain {
	public static void main(String[] args) {
		System.out.println("welcome to hashtable programms");
		HashMapService HashMap = new HashMapService();
		String givenString = "To be or not to be";
		String[] myStr = givenString.toLowerCase().split(" ");
		for (String string : myStr){
			HashMap.put(string, 1);
		}
		HashMap.print();
	}
}
