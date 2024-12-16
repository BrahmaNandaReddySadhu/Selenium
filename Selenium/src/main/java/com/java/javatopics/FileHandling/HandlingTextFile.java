package com.java.javatopics.FileHandling;

import java.io.*;
import java.util.Scanner;

public class HandlingTextFile {

    // craete the folder
    public static void createFolder(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("folder is created at the mentioned path" + folderPath);
        } else {
            System.out.println("folder is already available at the mentioned path" + folderPath);
        }

    }

    // check folder is already available or not
    public static boolean checkFolderExist(String folderPath) {
        File folder = new File(folderPath);
        return folder.exists();
    }

    // rename the existing folder name
    public static void renameFolder(String olderFolderName, String newFolderName) {
        File oldFolder = new File(olderFolderName);
        File newFolder = new File(newFolderName);

        if (checkFolderExist(olderFolderName)) {
            oldFolder.renameTo(newFolder);
            System.out.println(olderFolderName + " is renamed to new folder name " + newFolderName);
        }
    }

    // delete the folder name
    /*
    you can not directly delete the folder which contains some files
    you have to delete the file first and then delete the folder
     */
    public static void deleteFolder(String folderName) {
        File file = new File(folderName);
        // checking the file is exist or not
        if (file.exists()) {
            // if folder have files inside you ca not so you need to select the all the files
            File[] fileList = file.listFiles();
            for (File valueFromFileList : fileList) {
                valueFromFileList.delete();
            }
            file.delete();
         System.out.println("Folder deleted "+folderName);
        }
    }

   /* handling the file operation

   create , writing , reading , renaming , deleting files

    */

    // creating the file
    public static  void createFile(String filePath){
        File object = new File(filePath);
        try {
            if(object.createNewFile()){
                System.out.print("File created "+ object.getName());
            }else{
                System.out.print("File is already exsits");
            }
        } catch (IOException e) {
           e.printStackTrace();
        }

    }

    // writing data into into file
    public static void writeFile(String filePath, String content) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Successfully wrote to file");
        } catch (IOException e) {
            System.out.println("Error occured  while writing the content to the file");
            e.printStackTrace();
        }
    }


    public static void readFile(String filePath) {
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.print(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.print("Error occured while reading data ");
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        String folderPath = "D:\\BrahmanandaReddySadhu\\projects\\IntellijIdea\\HandlingFiles";
        createFolder(folderPath);
        System.out.println("Mentioned Folder is available at the location " + folderPath + "is " + checkFolderExist(folderPath));
        String newFolderPath = "D:\\BrahmanandaReddySadhu\\projects\\IntellijIdea\\HandlingFilesInJava";
        renameFolder(folderPath, newFolderPath);
        deleteFolder(newFolderPath);
        String fileName =newFolderPath+"\\test.text";
        createFile(fileName);
        writeFile(fileName,"this is content of the file");
        readFile(fileName);

    }
}
