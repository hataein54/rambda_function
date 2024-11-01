
//interface Printable {
//   void print(String s);
//}

// 람다 : 인터페이스 구현을 화살표 함수

import java.util.List;

interface Add {
	int add(int num1, int num2);
}

interface Div {
	int div(int num1, int num2);
}

interface Calculate {
	int cal(int num1, int num2);
}

interface Generator {
	List<Integer> rand();
}

public class LamdaMain2 {
	public static void main(String[] args) {
		
		
		
		

		// ==========================================

		Calculate c;

		c = (a, b) -> a + b;

		System.out.println(c.cal(5, 6));

		c = (a, b) -> a - b;

		System.out.println(c.cal(5, 6));

		// ==========================================
		Div div = (int num1, int num2) -> num1 / num2;

		System.out.println(div.div(4, 2));

		// ==========================================
		Printable prn = (s) -> System.out.println(s);

		prn.print("람다 완성");

		Add add = (int num1, int num2) -> {
			return num1 + num2;
		};

		int hap = add.add(5, 6);
		System.out.println(hap);
	}
}