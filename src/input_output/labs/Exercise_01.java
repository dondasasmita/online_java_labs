package input_output.labs;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

import java.io.*;

public class Exercise_01 {

        public static void main(String[] args) {

            BufferedInputStream in = null;
            BufferedOutputStream out = null;

            try {
                // initialize
                in = new BufferedInputStream (new FileInputStream("/Users/donda/Documents/CodingNomads/online_java_labs/test_files/another_test.txt"));
                out = new BufferedOutputStream(new FileOutputStream("/Users/donda/Documents/CodingNomads/online_java_labs/test_files/another_test_copy.txt"));
                int c;

                // while there is data to read in the inputStream "in"
                while ((c = in.read()) != -1) {
                    //write the data (byte by byte) to the outputStream "out"
                    out.write(c);
                }
            } catch (IOException ioe) {
                System.out.println("IOException is caught");
                ioe.printStackTrace();
            }
            finally {
                // close connections to files
                try {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }

                    } catch (IOException ioe) {
                    System.out.println("IOException is caught - No connection to close. ");
                }
            }
        }
}
