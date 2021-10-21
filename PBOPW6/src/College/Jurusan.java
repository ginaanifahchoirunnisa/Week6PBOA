package College;

public class Jurusan {
	private String namaJurusan;
	private ProgramStudi prodi;
	
	public Jurusan(String namaJurusan, ProgramStudi prodi) {
		this.namaJurusan = namaJurusan;
		this.prodi = prodi; 
	}

	public String getNamaJurusan() {
		return namaJurusan;
	}

	public void setNamaJurusan(String namaJurusan) {
		this.namaJurusan = namaJurusan;
	}

	public ProgramStudi getProdi() {
		return prodi;
	}

	public void setProdi(ProgramStudi prodi) {
		this.prodi = prodi;
	}


	
	
}
