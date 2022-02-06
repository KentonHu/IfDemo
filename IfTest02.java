/*
	考试奖励

	需求：
		小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，加入你可以控制小明的得分，
		请用程序实现小明到底该获得什么样的礼物，并在控制台输出。

	奖励：
		95~100	山地自行车一辆
		90~94   游乐场玩一次
		80~89   变形金刚玩具一个
		80一下  胖揍一顿
 */
import java.util.Scanner;

public class IfTest02{
	public static void main(String[] args) {
		//小明的考试成绩未知，可以使用键盘录入的方式获取值
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个分数：");
		int score = sc.nextInt();

		//由于奖励种类较多，属于多种判断，采用if...else if...else格式实现
		//为每种判断设置对应的条件
		//为每种判断设置对应的奖励
		/*
		if(score >= 95 && score <= 100){
			System.out.println("山地自行车一辆");			
		} else if (score >= 90 && score <= 94){
			System.out.println("游乐场玩一次");	
		} else if (score >= 90 && score <= 94){
			System.out.println("变形金刚玩具一个");	
		} else {
			System.out.println("胖揍一顿");	
		}
		*/
		//数据测试：正确数据，边界数据，错误数据
		if(score > 100 || score < 0 ){
			System.out.println("你输入的分数有误");
		} else if(score >= 95 && score <= 100){
			System.out.println("山地自行车一辆");			
		} else if (score >= 90 && score <= 94){
			System.out.println("游乐场玩一次");	
		} else if (score >= 90 && score <= 94){
			System.out.println("变形金刚玩具一个");	
		} else {
			System.out.println("胖揍一顿");	
		}
		
	}
}