package schildt.io21;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Просмотр в каталоге файлов с расширением "txt".
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "resources";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String[] s = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
