package kasus2_warmindo;

public class Warmindo {
	private String nama_produk;
	private double harga;
	private int qty;
	
//	public Warmindo(String nama, double harga, int qty) {
//		this.nama_produk = nama;
//		this.harga = harga;
//		this.qty = qty;
//	}
	
	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public double getHarga() {
		return harga;
	}

	public int getQty() {
		return qty;
	}
	
	public void tampilMenu() {
		System.out.println(nama_produk +"["+qty+"]"+"\tRp"+harga);
	}
	
	public void kurangiQty(int minQty) {
		qty -= minQty;
	}
	
}
