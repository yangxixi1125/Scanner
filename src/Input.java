import java.util.Scanner;

/**
 * 
 * @author yangxixi
 *
 */
public class Input {
	public static void main(String[] args) {
		//try(Scanner a = new Scanner(System.in)){}
		try(Scanner input = new Scanner(System.in)){

			System.out.printf("�����ַ�����");
			//greet�ַ����ɿ���̨����nextLine()�����ո�
			String greet = input.nextLine();
			System.out.println(greet);
			
			System.out.printf("�������֣�");
			//apple�����ɿ���̨����
			int apple = input.nextInt();
			System.out.println(apple + apple);

			
			System.out.printf("�����ַ�����");
			//greeting�ַ����ɿ���̨����next()������ո�
			String greeting = input.next();
			System.out.println(greeting);
			
			System.out.printf("�����ַ�����");
			//gree�ַ����ɿ���̨����nextLine()�����ո�
			String gree = input.nextLine();
			System.out.println(gree);
			
		}
		
	}

}
