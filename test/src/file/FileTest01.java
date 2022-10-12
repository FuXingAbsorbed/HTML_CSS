package file;


import java.io.File;
import java.io.IOException;
import java.util.Date;

/*File类和四大家族没有关系，所以File不能完成文件的 读和写
* File代表什么：文件和目录路径名的抽象表示形式
* 3.需要掌握File类的常用方法*/
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86188\\Documents\\Tencent Files\\1692509903\\FileRecv");
        file.exists();
        file.createNewFile();
        //可以创建多重目录吗？
        File f2=new File("D:/a/b/c/d/e/f");
        if(!f2.exists()){
            f2.mkdirs();
        }
        file.getParent();
        long haomiao = file.lastModified();
        Date date=new Date(haomiao);

    }

}
