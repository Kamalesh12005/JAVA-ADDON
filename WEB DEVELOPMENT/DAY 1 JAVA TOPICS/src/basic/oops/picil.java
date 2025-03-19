package basic.oops;

import java.util.Scanner;

public class picil {

	public static void main(String[] args) {
		Scanner in = new scanner(System.in);
		System.out.println("enter the radius");
		int r = in.nextInt();
		float a = 3.14 * r * r;
		System.out.println("the calculator=" +a);
	}

}
