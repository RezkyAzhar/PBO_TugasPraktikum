import java.io.*;
import java.util.Scanner;

public class soal2 {

	public static void main(String[] args) {
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("===================");
		for(int i=0;i<3;i++) {
			String s2 =  input2.next();
			int number = input2.nextInt();
			System.out.printf("%15s ",s2);
			System.out.printf("%03d\n",number);
		}
		System.out.println("===================");

	}

}
