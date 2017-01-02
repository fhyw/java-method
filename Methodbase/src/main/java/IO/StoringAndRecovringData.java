package IO;

import java.io.*;

/**
 * Created by fangxue on 16/12/18.
 * PrintWriter
 *
 */
public class StoringAndRecovringData {

    public static void outPW() throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Data.txt")));
        pw.println(3.14159);
        pw.println("this is pai");
        pw.close();

        BufferedReader inFile = new BufferedReader(new FileReader("Data.txt"));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = inFile.readLine()) != null) {
            sb.append(s + "\n");
        }
        System.out.println(sb);

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
        System.out.println(in.readDouble());
    }

    public static void main(String[] args) throws IOException{
//        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
//        out.writeDouble(3.14159);
//        out.writeUTF("this is pai");
//        out.close();
//        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
//        BufferedReader inFile = new BufferedReader(new FileReader("Data.txt"));
//        String s;
//        StringBuilder sb = new StringBuilder();
//        while ((s = inFile.readLine()) != null) {
//            sb.append(s + "\n");
//        }
//        System.out.println(in.readDouble());
//        System.out.println("***************************");
//        System.out.println(in.readUTF());
//        System.out.println(sb);void
          outPW();
    }
}