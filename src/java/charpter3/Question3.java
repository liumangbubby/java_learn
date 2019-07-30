package charpter3;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要打印的数字：");
		String line = scanner.next();
		int length = line.length();
		for(int a = 0;a <length;a++){
			System.out.print(line.charAt(a));
			if(a==length-1){
				break;
			}
			System.out.print("-");
		}

	}
}