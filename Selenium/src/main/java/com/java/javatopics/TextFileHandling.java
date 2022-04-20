package com.java.javatopics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandling {
	static File file = new File("./Resources/PropertiesFiles/simpleTest.txt");
	public static void textFileWriter() {

		try {
			FileWriter writer = new FileWriter(file);
			writer.write("this is is text format data \ndo you want to add anything");
			writer.close();

		} catch (IOException e) {
			System.out.println("File Writer Catch block");
			e.printStackTrace();
		}

	}


	public static void textFileReader() {

		try {
			FileReader  fileReader = new FileReader(file);
			int data =fileReader.read();
			while(data !=-1) {
				char finalDataAfterConvertUnicodeDataToChar = (char) data;

				System.out.print(finalDataAfterConvertUnicodeDataToChar);
				data= fileReader.read();
			}
			fileReader.close();


		} catch (FileNotFoundException e) {
			System.out.println("File reader catch block");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("FileReader second catch block");
			e.printStackTrace();
		}


	}


	public static void textBufferedWriter()  {

		/*
		 * BuffredWriter , BufferedReader  accepting only Writer object as input  not file , Buffered Writer, BufferedReader can not communicate with the files directly they use internally Writer objects 
		 */
		try {
			BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write("this is Buffered Writer text");
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("Buffered writer catch block");
			e.printStackTrace();
		}
	}

	public static void textBufferedReader() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			try {
				int value=reader.read();
				while(value !=-1) {
					System.out.print((char)value);
					value=reader.read();
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Buffered Reader Ctach block");
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		textFileWriter();
		textFileReader();
		textBufferedWriter();
		textBufferedReader();
	}
}