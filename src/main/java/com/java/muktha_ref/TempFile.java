package com.java.muktha_ref;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.acl.LastOwnerException;

public class TempFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("file creation ");
		createTempFile();
	}

	// Creates a temporary file that will be deleted on JVM exit.
    private static String createTempFile() throws IOException {
        // Since Java 1.7 Files and Path API simplify operations on files
        Path path = Files.createTempFile("sample-file", ".txt");
        System.out.println("path="+path);
        File file = path.toFile();
        // writing sample data
        Files.write(path, "Temporary content...".getBytes(StandardCharsets.UTF_8));
        // This tells JVM to delete the file on JVM exit.
        // Useful for temporary files in tests.
        //file.deleteOnExit();
       
       System.out.println("file path:{}"+file.getPath());
       System.out.println("file path:{}"+file.getParent());
       System.out.println("file name:"+file.getName());
       System.out.println("file absolutePath={} and canonicalPath:{}"+file.getAbsolutePath());
        return file.getAbsolutePath();
    }

}
