package restoran;

public class Restaurant {
	private Makanan[] foodList; 
	private static byte id=0;

	public Restaurant() {
		foodList = new Makanan[10];
	}
	
//	public static byte getId() {
//		return id;
//	}
//
//	public static void setId(byte id) {
//		Restaurant.id = id;
//	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.foodList[id] = new Makanan (nama, harga, stok);
	}
	
	public void tampilMenuMakanan() {
		for (int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				this.foodList[i].tampilMakanan();
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		return foodList[id].getStok() == 0;
	}
	
	public static void nextId() {
		id++;
	}
	
	public void pesan(String Nama_makanan, int jumlah) {
		for(int i = 0; i <= id; i++) {
			if(Nama_makanan.equals(foodList[i].getNama_makanan())) {
				if(foodList[i].getStok() >= jumlah) {
					System.out.println(jumlah + " " + foodList[i].getNama_makanan() + " terjual!");
					foodList[i].stokKurang(jumlah);
				}else System.out.println("Stok " +foodList[i].getNama_makanan() + " tidak cukup");
			}
		}
	}

}
