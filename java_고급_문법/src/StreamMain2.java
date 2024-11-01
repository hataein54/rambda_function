import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMain2 {
   public static void main(String[] args) {
	   
	   List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	   
	   //스트림의 요소를 하나씩 줄여가며 누적 연산을 수행
	   Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
	   sum.ifPresent(s -> System.out.println("sum"+s));
	   
	   Integer.sum(0, 0);
	   
	   //////////////////////////////
	   List<Student> sArr = new ArrayList<Student>();
	      sArr.add(new Student(90,80,70,"홍길동"));
	      sArr.add(new Student(90,60,70,"홍길순"));
	      sArr.add(new Student(90,60,70,"홍말자"));   
	      sArr.add(new Student(50,50,50,"바둑이"));  
	      
	      //filter, map 썩어서 표현
	      sArr.stream()
	      	  .filter(student -> student.name.startsWith("홍"))
	      	  .mapToDouble((student)->{
	      		  return (student.kor + student.eng + student.math)/3.0;
	      	  }).forEach(avg -> System.out.println(avg));
   }   
}
