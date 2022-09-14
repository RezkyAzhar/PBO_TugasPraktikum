import java.io.*;
import java.util.Scanner;

public class soal1 {

	public static void main(String[] args) {
		String s = " ";
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Input a string: ");
			s = input.nextLine();
			if(s.length() < 1)
				System.out.println("Please input a string.");
		}while(s.length() < 1);
		
		String[] words = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@");
		int n = words.length;
		
		System.out.println(n);
		for(String w : words){
			System.out.println(w);
		}

	}

}
