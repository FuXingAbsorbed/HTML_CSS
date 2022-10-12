import javafx.print.Printer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void main(String msg) throws Exception {
        PrintStream printer=new PrintStream(new FileOutputStream("log.txt",true));
        System.setOut(printer);
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = sdf.format(date);
        System.out.println(format+":"+msg);
    }
}
