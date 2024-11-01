import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOStreamMain {
	public static void outStreamFunctoin() throws Exception {
		OutputStream out = new FileOutputStream("data.dat");
		out.write(7);
		out.close();
	}

	public static void inputStreamFunctoin() throws Exception {
		InputStream in = new FileInputStream("data.dat");
		
		int dat = in.read();
		in.close();

		System.out.println(dat);
		
	}

	public static void fileCopy() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대상파일");
		String src = sc.nextLine();
		
		System.out.println("사본이름");
		String dst = sc.nextLine();
		
		try(InputStream in = new FileInputStream("a.png") ;
				OutputStream out =new FileOutputStream("b.png")){
			
			int data;
			while(true) {
				data = in.read();//바이트 단위로 읽어들임
				
				
				if(data ==-1) {
					break;
				}
				out.write(data);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		
		fileCopy();
		//outStreamFunctoin();
		//inputStreamFunctoin();
		
	}
}
