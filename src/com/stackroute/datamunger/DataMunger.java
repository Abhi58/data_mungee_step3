package com.stackroute.datamunger;

import java.util.Scanner;
import java.util.*;
import java.io.*;
import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;
import com.stackroute.datamunger.reader.CsvQueryProcessor;

public class DataMunger {

	public static void main(String[] args) throws IOException  {

		// read the file name from the user
		/*
		 * create object of CsvQueryProcessor. We are trying to read from a file inside
		 * the constructor of this class. Hence, we will have to handle exceptions.
		 */
		
		CsvQueryProcessor cqp = new CsvQueryProcessor("data/ipl.csv");

		/*
		 * call getHeader() method of CsvQueryProcessor class to retrieve the array of
		 * headers
		 */
		 cqp.getHeader();
		/*
		 * call getColumnType() method of CsvQueryProcessor class to retrieve the array
		 * of column data types which is actually the object of DataTypeDefinitions
		 * class
		 */
		 cqp.getColumnType();
		/*
		 * display the columnName from the header object along with its data type from
		 * DataTypeDefinitions object
		 */
	
		
	}

}