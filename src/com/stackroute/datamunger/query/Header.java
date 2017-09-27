package com.stackroute.datamunger.query;

//header class
public class Header {

	/*
	 * this class should contain a member variable which is a String array, to hold
	 * the headers.
	 */
 
   private String array[] = new String[50];
	public String[] getHeaders() {
			
		return array;
	}
	public String[] setHeaders(String arr[]) {
		
		return this.array=arr;
	}

}