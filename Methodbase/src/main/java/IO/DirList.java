package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by fangxue on 16/12/17.
 * 此类用户查找某目录下是否存在某文件
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");//通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
        String[] list;
        if(args.length == 0)
            list = path.list();//返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
        else
            list = path.list(new DirFilter(args[0]));//返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;
    public DirFilter(String regex) {
        pattern = pattern.compile(regex);
    }
    public boolean accept(File dir, String name) {//测试指定文件是否应该包含在某一文件列表中。
        return pattern.matcher(name).matches();
    }
}
