package kasus2_warmindo;
import java.util.Scanner;
import java.io.*;

public class WarmindoMain {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		WarmindoJual menu = new WarmindoJual();
		menu.tambahMakanan();
		int temp = 0;
		while(temp != 1) {
			menu.tampilMenuMakanan();
			System.out.println();
			System.out.print("Pilih : ");
			int pilihan = myObj.nextInt();
			menu.isOutOfStock(pilihan);
			System.out.print("Jumlah : ");
			int quantity = myObj.nextInt();
			System.out.println();
			pilihan = pilihan - 1;
			menu.beliMakanan(pilihan,quantity);
		System.out.print("Selesai membeli? (1 = Ya 2 = Tidak)");
		temp = myObj.nextInt();
		}
	}
}
