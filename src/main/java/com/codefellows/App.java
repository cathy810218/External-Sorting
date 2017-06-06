package com.codefellows;
import java.io.*;
import com.google.code.externalsorting.ExternalSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String inputfile = "file1.txt";
        String outputfile = "file2.txt";

    }

    public static void sort(File input, File output) throws IOException {
        ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(input), output);
    }
}
