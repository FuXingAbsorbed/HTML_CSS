import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*DataInoutStream�������ֽ�������
* DataOutputStreamд���ļ���ֻ��ʹ��DataInoutStreamȥ�������Ҷ���ʱ������Ҫ��ǰ֪��д���˳��
* ����˳����Ҫ��д��˳��һ�£��ſ�������ȡ������*/
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dis=new DataInputStream(new FileInputStream("data"));
        //��ʼ��
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
