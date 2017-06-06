package com.codefellows;
import java.io.*;
import com.google.code.externalsorting.ExternalSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        
        File inputfile = new File("/Users/cathyoun/IdeaProjects/java501externalsorting/src/main/resource/inputFile.txt");
        File outputfile = new File("/Users/cathyoun/IdeaProjects/java501externalsorting/src/main/resource/outputFile.txt");

        sort(inputfile, outputfile);

    }

    public static void sort(File input, File output) throws IOException {
        ExternalSort.mergeSortedFiles(ExternalSort.sortInBatch(input), output);
    }
}
