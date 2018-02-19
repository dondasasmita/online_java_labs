package input_output.labs;

/**
 * Input/Output Exercise 1: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      BONUS: If you are feeling bold, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

import java.io.*;

public class Exercise_02 {

    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            // initialize
            in = new FileInputStream("/Users/donda/Documents/CodingNomads/online_java_labs/test_files/file_to_encrypt.txt");
            out = new FileOutputStream("/Users/donda/Documents/CodingNomads/online_java_labs/test_files/encrypted_file.txt");
            int c;

            // while there is data to read in the inputStream "in"
            while ((c = in.read()) != -1) {
                //write the data (byte by byte) to the outputStream "out"
                try {
                    switch (c) {
                        case 97:
                            c = 45;
                            out.write(c);
                            break;
                        case 101:
                            c = 126;
                            out.write(c);
                            break;
                        default:
                            out.write(c);
                    }
                } catch(IOException ioe) {
                    System.out.println("IOException is caught. Unable to change character");
                    ioe.printStackTrace();
                }
            }
        }
        catch(IOException ioe) {
            System.out.println("IOException is caught");
            ioe.printStackTrace();
            }

            finally{
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
