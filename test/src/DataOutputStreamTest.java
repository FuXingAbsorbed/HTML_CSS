/*这个流可以将数据连同数据的累心一并写入文件
* 注意：这个文件时普通文件文档（这个文件使用记事本打不开）*/

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("data"));
        //创建数据专属的字节输出流
        byte b=100;
        short s=200;
        int i=300;
        long l=400l;
        float f=3.0f;
        double d=3.14;
        boolean sex=false;
        char c='a';
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);
        //刷新
        dos.flush();
        //关闭最外层
        dos.close();
    }
}
