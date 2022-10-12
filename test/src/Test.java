import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*转化流*/
public class Test {
    public static void main(String[] args)  {
        /*//字节流
        FileInputStream in=new FileInputStream("copy02.java");
        //通过转化刘转化(InputStreamReader将字节流转化为字符流)
        //in是节点流，reader是包装流
        InputStreamReader reader=new InputStreamReader(in);
        //这个构造方法只能传一个字符流，不能传字节流
        BufferedReader br=new BufferedReader(reader);*/
        /*BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("copy02.java")));

        String line=null;
        while((line=br.readLine())!=null)
        {
            System.out.println(line);
        }
        //关闭最外层
        br.close();*/


    }
}
