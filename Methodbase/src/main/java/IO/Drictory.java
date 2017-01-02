package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by fangxue on 16/12/17.
 * 用于打印某目录下的路径(目录和文件),使用File.listFile()
 */
public class Drictory {

    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {//返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }

    public static File[] local(String path, final String regex) {
        return local(new File(path), regex);
    }

    //将开始目录的名字转换为File对象
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();

        public Iterator<File> iterator() {
            return files.iterator();
        }

        public void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString() {
            return "dirs: " + PPrint.pformat(dirs) + "\n\nfiles" + PPrint.pformat(files);
        }
    }

    public static TreeInfo walk(String start, String regex) {
            return recurseDirs(new File(start), regex);
    }

    public static TreeInfo walk(File start, String regex) {
            return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) {
            return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
            return recurseDirs(new File(start), ".*");
    }


    public static TreeInfo recurseDirs(File startDir, String regex) throws NullPointerException {
        TreeInfo result = new TreeInfo();
        try {
            for (File item : startDir.listFiles()) {
                if (item.isDirectory()) {
                    result.dirs.add(item);
                    result.addAll(recurseDirs(item, regex));
                } else if (item.getName().matches(regex))
                    result.files.add(item);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        if(args.length == 0)
            System.out.println(walk("./Methodbase"));
        else
            for(String arg : args)
                System.out.println(walk(arg));
    }

}
