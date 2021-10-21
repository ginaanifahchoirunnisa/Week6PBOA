package College;

import java.util.*;
public class Mahasiswa {
	private String namaMahasiswa;
	private String nim;
	private Kelas kelas;
	private ArrayList<NomorKontak> noKontak;
	
	private Jurusan jurusan;
	
	

	public Mahasiswa(String namaMhs, String nim, Kelas kelas) {
		this.namaMahasiswa = namaMhs;
		this.nim = nim;
		this.kelas = kelas;
	}
	public String getNamaMahasiswa() {
		return namaMahasiswa;
	}
	public void setNamaMahasiswa(String namaMahasiswa) {
		this.namaMahasiswa = namaMahasiswa;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public Kelas getKelas() {
		return kelas;
	}
	public void setKelas(Kelas kelas) {
		this.kelas = kelas;
	}
	public ArrayList<NomorKontak> getNoKontak() {
		return noKontak;
	}
	public void setNoKontak(ArrayList<NomorKontak> noKontak) {
		this.noKontak = noKontak;
	}
	
	// --> dependency 
	public void Waldos(Waldos walidosen) {
		System.out.println("Dengan wali Dosen : " + walidosen.getNamaWaldos());
	}
	


	public Jurusan getJurusan() {
		return jurusan;
	}
	public void setJurusan(Jurusan jurusan) {
		this.jurusan = jurusan;
	}

	
	
}
