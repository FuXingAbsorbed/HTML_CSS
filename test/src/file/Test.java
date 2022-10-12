package file;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream in=new FileInputStream("C:\\Users\\86188\\Desktop\\作业\\8月23");
        FileOutputStream out=new FileOutputStream("C:\\Users\\86188\\Desktop\\作业\\823");

        ObjectOutputStream oos=new ObjectOutputStream(out);
        /*oos.writeObject();*/
        /*File file=new File("C:\\Users\\86188\\Desktop\\1班9组日志和作业");
        file.listFiles();*/
        byte[] bytes=new byte[1024*1024];
        int l=0;
        while((l=in.read(bytes))!=-1){
            out.write(bytes,0,l);
        }

        out.flush();
        if (out != null) {
            out.close();
        }
        if (in != null) {
            in.close();
        }
    }

    public static void copy (File file) throws Exception {
        FileInputStream in=null;
        FileOutputStream out=null;
        File outFile=new File("C:\\Users\\86188\\Desktop\\拷贝");
        if(file.isFile()){
            File newFile=new File(file.getAbsolutePath()+"\\"+file.getName());
            in=new FileInputStream(newFile);
            out=new FileOutputStream(outFile.getAbsolutePath()+"\\"+file.getName());
            byte[] bytes=new byte[1024*1024];
            int length=0;
            while((length=in.read(bytes))!=-1){
                out.write(bytes,0,length);
            }
        }else if(file.isDirectory()){
            file=new File(file.getAbsolutePath()+"\\"+file.getName());
            File[] files = file.listFiles();
            for (File f :
                    files) {
                copy(f);
            }
        }

        out.flush();
        if (out != null) {
            out.close();
        }
        if (in != null) {
            in.close();
        }
    }
}
