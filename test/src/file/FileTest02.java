package file;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        //FILe[] listFiles()
        //获取当前目录下所有的子文件
        File f=new File("");
        File[] files = f.listFiles();
        for(File file:files){
            System.out.println(file.getAbsoluteFile());
        }
    }
}
