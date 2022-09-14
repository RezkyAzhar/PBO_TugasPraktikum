package Teori;

public class Himpunan {
	private String ketua_himpunan;
	private String kabinet;
	private String pembina;
	private int tahun_angkatan;

	Himpunan(String _ketua_himpunan, String _kabinet, String _pembina, int _tahun_angkatan){
		this.ketua_himpunan = _ketua_himpunan;
		this.kabinet = _kabinet;
		this.pembina = _pembina;
		this.tahun_angkatan = _tahun_angkatan;
	}
	public String getketua_himpunan() {
		return ketua_himpunan;
	}
	public void setketua_himpunan(String ketua_himpunan) {
		this.ketua_himpunan = ketua_himpunan;
	}

	public String getkabinet() {
		return kabinet;
	}
	public void setkabinet(String kabinet) {
		this.kabinet = kabinet;
	}

	public String getPembina() {
		return pembina;
	}
	public void setPembina(String pembina) {
		this.pembina = pembina;
	}

	public int getTahun_angkatan() {
		return tahun_angkatan;
	}
	public void setTahun_angkatan(int tahun_angkatan) {
		this.tahun_angkatan = tahun_angkatan;
	}

	public void Show() {
		System.out.println("Ketua Himpunan  : "+this.ketua_himpunan);
		System.out.println("Kabinet         : "+this.kabinet);
		System.out.println("Pembina         : "+this.pembina);
		System.out.println("Tahun Angkatan  : "+this.tahun_angkatan);
	}

}
