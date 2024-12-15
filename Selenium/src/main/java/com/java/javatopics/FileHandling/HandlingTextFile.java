package com.java.javatopics.FileHandling;

import java.io.File;

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

    public static void main(String[] args) {
        String folderPath = "D:\\BrahmanandaReddySadhu\\projects\\IntellijIdea\\HandlingFiles";
        createFolder(folderPath);
        System.out.println("Mentioned Folder is available at the location " + folderPath + "is " + checkFolderExist(folderPath));


    }
}
