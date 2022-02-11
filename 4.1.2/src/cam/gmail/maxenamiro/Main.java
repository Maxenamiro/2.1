package cam.gmail.maxenamiro;

import java.net.NetworkInterface;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("введите число ");
		int n = sc.nextInt();
		long result=1;
		if((n>4)&&(n<16))
				for(int i=1;i<=n;i++ ) {
					result*=i;
				}
		System.out.println(result);
	}

}
