package file;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        //FILe[] listFiles()
        //��ȡ��ǰĿ¼�����е����ļ�
        File f=new File("");
        File[] files = f.listFiles();
        for(File file:files){
            System.out.println(file.getAbsoluteFile());
        }
    }
}
