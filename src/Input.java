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

			System.out.printf("输入字符串：");
			//greet字符串由控制台输入nextLine()跳过空格
			String greet = input.nextLine();
			System.out.println(greet);
			
			System.out.printf("输入数字：");
			//apple整数由控制台输入
			int apple = input.nextInt();
			System.out.println(apple + apple);

			
			System.out.printf("输入字符串：");
			//greeting字符串由控制台输入next()不输入空格
			String greeting = input.next();
			System.out.println(greeting);
			
			System.out.printf("输入字符串：");
			//gree字符串由控制台输入nextLine()跳过空格
			String gree = input.nextLine();
			System.out.println(gree);
			
		}
		
	}

}
