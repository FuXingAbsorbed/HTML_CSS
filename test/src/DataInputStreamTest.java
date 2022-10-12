import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*DataInoutStream：数据字节输入流
* DataOutputStream写的文件，只能使用DataInoutStream去读。并且读的时候你需要提前知道写入的顺序
* 读的顺序需要和写的顺序一致，才可以正常取出数据*/
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dis=new DataInputStream(new FileInputStream("data"));
        //开始读
        byte b=dis.readByte();
        short s=dis.readShort();
        int i=dis.readInt();
        long l=dis.readLong();
        float f=dis.readFloat();
        double d=dis.readDouble();
        boolean sex=dis.readBoolean();
        char c=dis.readChar();

        dis.close();
    }
}
