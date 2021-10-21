package College;

import java.util.*;
public class Kelas {
	private String namaKelas;
	///Association
	private ArrayList<Mahasiswa> mhs;
	
	public Kelas(String namaKelas, ArrayList<Mahasiswa> mhs) {
		this.namaKelas = namaKelas;
		this.mhs = mhs;
	}
	
	public String getNamaKelas() {
		return namaKelas;
	}
	
	public void setNamaKelas(String namaKelas) {
		this.namaKelas = namaKelas;
	}
	
	public ArrayList<Mahasiswa> getMhs() {
		return mhs;
	}
	
	public void setMhs(ArrayList<Mahasiswa> mhs) {
		this.mhs = mhs;
	}
	
	

	
	
	
}
