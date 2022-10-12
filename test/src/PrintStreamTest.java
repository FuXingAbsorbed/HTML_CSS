import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        /*java.io.PrintStream:标准字节输出流，默认输出到控制台*/
        System.out.println("hello world");
        PrintStream ps=System.out;
        ps.println(111);
        //
    }
}
