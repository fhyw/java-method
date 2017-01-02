package IO;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by fangxue on 16/12/18.
 * 使用FIleReader和BufferedReader的组合读取文件
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s ;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            //System.out.println(in);
            sb.append(s + "\n");
        }
        in.close();//关闭该流并释放与之关联的所有资源。在关闭该流后，再调用 read()、
                    // ready()、mark()、reset() 或 skip() 将抛出 IOException。关闭以前关闭的流无效
        return sb.toString();
    }

//    public static String read(String filename) throws IOException{
//        FileReader in = new FileReader(filename);
//        String s ;
//        char[] c = new char[1024];
//        StringBuilder sb = new StringBuilder();
//        while ((in.read(c)) != 0) {
//            //System.out.println(in);
//            sb.append(c);
//        }
//        in.close();
//        return sb.toString();
//    }
    public static String readRet(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s ;
        LinkedList<String> sb = new LinkedList<String>();
        while ((s = in.readLine()) != null) {
            s = s + "\n";
            sb.add(s);
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException{
        //System.out.println(read("./Methodbase/src/main/java/IO/BufferedInputFile.java"));
        System.out.println(readRet("./Methodbase/src/main/java/IO/BufferedInputFile.java"));
    }

}
