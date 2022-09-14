import java.io.*;
import java.util.Scanner;

public class soal5_bukaTutupJalan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        //Input User
        String plat = input.nextLine();
        input.close();
        
        //Menghapus Spasi
        String noSpace;              
        noSpace = plat.replaceAll("\\s", "");
        
        //Convert plat nomor kedalam numerik
        long numPlat = Long.parseLong(noSpace);
        
        //pengecekan kondisi
        if(((numPlat-999999)%5)==0){
            System.out.println("berhenti");
        }
        else{
            System.out.println("jalan");
        }

	}

}
