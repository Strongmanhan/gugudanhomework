import java.util.Scanner;

public class GugudanHomework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ���.");
		String num = sc.next();
		
		String[] splitedValue = num.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int secend = Integer.parseInt(splitedValue[1]);
		
		
		System.out.println(first +("X")+ secend + "��");
		for(int i=first; i <= first; i++) {
			
			for(int j=1; j <= secend; j++) {
				System.out.println(i*j);
			}
		}
		
		
	
		
					
				
			
	
			
			
		

	}

}
