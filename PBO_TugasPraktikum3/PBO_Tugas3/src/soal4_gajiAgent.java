import java.io.*;
import java.util.Scanner;

public class soal4_gajiAgent {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        
        //Pendeklarasian Variable
        int gajiPokok = 500000;
        int hargaItem = 50000;
        int bonus;
        int gajiTotal = 0;
        
        //Input User
        int terjual = input.nextInt();
        input.close();
        
        //Pengecekan kondisi
        if(terjual>=40 && terjual<80){
            bonus = (int)((terjual*hargaItem)*(25.0f/100.0f));
            gajiTotal = gajiPokok + bonus;
        }               
        else if(terjual<40 && terjual>=15){
            bonus = (int)((terjual*hargaItem)*(10.0f/100.0f));
            gajiTotal = gajiPokok + bonus;
        }
        else if(terjual>=80){
            bonus = (int)((terjual*hargaItem)*(35.0f/100.0f));
            gajiTotal = gajiPokok + bonus;
        }
        else{
            terjual = 15-terjual;
            bonus = (int)((terjual*hargaItem)*(15.0f/100.0f));
            gajiTotal = gajiPokok - bonus;
        }
        
        //Menampilkan hasil
        System.out.println(gajiTotal);

	}

}
