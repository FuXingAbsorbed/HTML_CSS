package file;


import java.io.File;
import java.io.IOException;
import java.util.Date;

/*File����Ĵ����û�й�ϵ������File��������ļ��� ����д
* File����ʲô���ļ���Ŀ¼·�����ĳ����ʾ��ʽ
* 3.��Ҫ����File��ĳ��÷���*/
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\86188\\Documents\\Tencent Files\\1692509903\\FileRecv");
        file.exists();
        file.createNewFile();
        //���Դ�������Ŀ¼��
        File f2=new File("D:/a/b/c/d/e/f");
        if(!f2.exists()){
            f2.mkdirs();
        }
        file.getParent();
        long haomiao = file.lastModified();
        Date date=new Date(haomiao);

    }

}
