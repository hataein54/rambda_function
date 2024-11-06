import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;





public class RWriterStreamain {   
   
   public static void main(String[] args) throws Exception {   
      
      try(Writer out = new FileWriter("data.txt")){
         out.write('A');
         out.write('한');
         
      }catch (Exception e) {
         e.printStackTrace();
      }
      
      try(Reader in = new FileReader("data.txt")){
            int ch;
            
            while(true) {
               ch = in.read(); // 문자를 하나씩 읽는다. //2바이트 단위로
               if(ch == -1) // 더 이상 읽을 문자가 없다면,
                  break;
               System.out.print((char)ch); // 문자를 하나씩 출력한다.
            }

         
      }catch (Exception e) {
         e.printStackTrace();
      }
      

   }   
}
