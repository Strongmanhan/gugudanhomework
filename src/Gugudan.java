import java.util.Scanner;

public class Gugudan {
	public static int [] calculate(int times) {

		int [] result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	public static void print(int[] result) {
		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]);
		}

		
	}
	
	
	
	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			System.out.println(i + "��");
			int [] result = calculate(i);
			print(result);
			
		}
		
	
//		int [] result = calculate(2);
//		print(result);
//
//		int [] times3 = calculate(3);
//		print(result);
//		
//		int [] times4 = calculate(4);
//		print(result);
		

		
		//		//2��
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int number = sc.nextInt();
//		System.out.println("�Է��� ���ڴ� = " + number);
//		if(number<2) {
//			System.out.println("�߸��� �� �Դϴ�.");
//		}
//		else if(number >9) {
//			System.out.println("�߸��� �� �Դϴ�.");
//		}
//		else {
//		for(int x = 1; x < 10; x++) {
//			System.out.println(number * x);
//		}
//		}
//		
//		
//		
//		
//		
//		/*int i = 1;
//		while (i<10) {
//			System.out.println(6*i);
//			i++;
//			
//		}
//		
//		for(int j=1; j<10; j++) {
//			System.out.println(7 *j);
//		}
//	
//		
//		int result = 4 * 1;
//		
//		System.out.println(result);
//		
//		
//		result = 4*2;
//		System.out.println(result);*/
	}

}
