/*��������Խ�������ͬ���ݵ�����һ��д���ļ�
* ע�⣺����ļ�ʱ��ͨ�ļ��ĵ�������ļ�ʹ�ü��±��򲻿���*/

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("data"));
        //��������ר�����ֽ������
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
        //ˢ��
        dos.flush();
        //�ر������
        dos.close();
    }
}
