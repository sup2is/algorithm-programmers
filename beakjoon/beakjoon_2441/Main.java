package beakjoon_2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int a = scanner.nextInt();
		
		for(int i = a ; i > 0 ; i --) {
			for(int k = a; k > i; k--) {
				sb.append(" ");
			}
			
			for(int j = 1; j<= i; j++) {
				sb.append("*");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}