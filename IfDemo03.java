/*
	if语句格式2

	格式：
		if (关系表达式1){
			语句体1;
		} else if (关系表达式2) {
			语句体2;
		}
		...
		else {
			语句体n+1
		}

	执行流程：
		1：首先计算关系表达式1的值。
		2：如果关系表达式1的值为true就执行语句体1；如果值为false就计算关系表达式2的值。
		3：如果关系表达式2的值为true就执行语句体2；如果值为false就计算关系表达式3的值。
		4：...
		4：如果没有任何关系表达式为true，就执行语句体n+1。
 */
import java.util.Scanner;

public class IfDemo03{
	public static void main(String[] args) {
		System.out.println("开始");

		//需求：键盘录入一个星期数(1,2,3,4,5,6,7)，输出对应的星期一，星期二...星期日
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个星期数：");
		int number = sc.nextInt();

		if(number == 1){
			System.out.println("星期一");
		} else if (number == 2){
			System.out.println("星期二");
		} else if (number == 3){
			System.out.println("星期三");
		} else if (number == 4){
			System.out.println("星期四");
		} else if (number == 5){
			System.out.println("星期五");
		} else if (number == 6){
			System.out.println("星期六");
		} else {
			System.out.println("星期日");
		}
		System.out.println("结束");
	}
}