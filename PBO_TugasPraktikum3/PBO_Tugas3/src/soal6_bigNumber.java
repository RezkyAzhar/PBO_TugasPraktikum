import java.math.BigInteger;
import java.util.Scanner;

public class soal6_bigNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        //Input User
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        input.close();
        
        //Tampilkan Hasil
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

	}

}
