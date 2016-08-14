package tw.org.iii.classroom;

import java.util.Scanner;

public class Brad06 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int a  ;
		System.out.print("請輸入：");
		a = user.nextInt();
		if(a%4 == 0){
			if(a%100 == 0){
				if(a%400 == 0){
					if(a%4000 == 0){
						System.out.print("非閏年");
					}
					else{
						System.out.print("閏年");
					}
				}
				else{
					System.out.print("非閏年");
				}
			}
			else{
				System.out.print("閏年");
			}
						
		}
		else
			System.out.println("非閏年");
	}
}
