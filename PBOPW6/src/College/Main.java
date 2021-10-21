package College;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-->composition
		
		Jurusan jurProdi1 = new Jurusan
				("Teknik Komputer dan Informatika",new ProgramStudi("D3 Teknik Informatika"));
		
		Jurusan jurProdi2 = new Jurusan
				("Teknik Komputer dan Informatika",new ProgramStudi("D4 Teknik Informatika"));
		
		
		//-->aggregation
		ArrayList<NomorKontak> kontakmhs1 = new ArrayList<>();
		kontakmhs1.add(new NomorKontak("0867362837"));
		kontakmhs1.add(new NomorKontak("0892639202"));
		
		ArrayList<NomorKontak> kontakmhs2 = new ArrayList<>();
		kontakmhs2.add(new NomorKontak("0816183682"));
		kontakmhs2.add(new NomorKontak("0836283232"));
		
		ArrayList<NomorKontak> kontakmhs3 = new ArrayList<>();
		kontakmhs3.add(new NomorKontak("08128379082"));
		kontakmhs3.add(new NomorKontak("0817829323"));
		
		
		ArrayList<Mahasiswa> mhs = new ArrayList<>();
		
		//Association
		Kelas kelas1 = new Kelas("1A",mhs);
		Mahasiswa mhs1 = new Mahasiswa("Robi","281682",kelas1);
		Mahasiswa mhs2 = new Mahasiswa("Bima","152715",kelas1);
		Mahasiswa mhs3 = new Mahasiswa("Haikal","25385",kelas1);
		
		//masuk ke mhs ---> Kelas akan menampung beberapa Mhs dibawah ini 
		mhs.add(mhs1);
		mhs.add(mhs2);
		mhs.add(mhs3);
		
		//Aggregation
		mhs1.setNoKontak(kontakmhs1); 
		mhs2.setNoKontak(kontakmhs2);
		mhs3.setNoKontak(kontakmhs3);
		

		
		
		//pengaturan jurusan ke mhs1 --> composition
		mhs1.setJurusan(jurProdi1);
		mhs2.setJurusan(jurProdi2);
		mhs3.setJurusan(jurProdi1);
		
		//--> Dependency 
		Waldos walidosen1 = new Waldos("Rahmawati S.Kom.,M.T");
		Waldos walidosen2 = new Waldos("Reza Wahyudi S.Kom.,M.T");
		
		
		
		

		
		//Implementasi menggunakan --> composition 
//		System.out.println(mhs1.getJurusan().getNamaJurusan());
//		System.out.println(mhs1.getJurusan().getProdi().getNamaProdi());
		
		//Association
		System.out.println("Daftar Seluruh Mahasiswa Kelas 1");
		for(Mahasiswa mahasiswa : kelas1.getMhs()) {
			System.out.println("Nama     : "+ mahasiswa.getNamaMahasiswa());	
		}
		
		
		
		int a = 1;
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("Nama              : " + mhs1.getNamaMahasiswa());
		System.out.println("Contact Mahasiswa : ");
		for(NomorKontak kontak : kontakmhs1) {
			
			System.out.println("["+a+"]"+kontak.getNomorKontak());
			a++;
		}
		System.out.println("Kelas             : " + mhs1.getKelas().getNamaKelas());
		System.out.println("Jurusan           : " + mhs1.getJurusan().getNamaJurusan());
		System.out.println("Program Studi     : " + mhs1.getJurusan().getProdi().getNamaProdi());
		mhs1.Waldos(walidosen1);
		
		
		a = 1;
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("Nama              : " + mhs2.getNamaMahasiswa());
		System.out.println("Contact Mahasiswa : ");
		for(NomorKontak kontak : kontakmhs2) {
			
			System.out.println("["+a+"]"+kontak.getNomorKontak());
			a++;
		}
		System.out.println("Kelas             : " + mhs2.getKelas().getNamaKelas());
		System.out.println("Jurusan           : " + mhs2.getJurusan().getNamaJurusan());
		System.out.println("Program Studi     : " + mhs2.getJurusan().getProdi().getNamaProdi());
		mhs1.Waldos(walidosen2);
	
		
		a = 1;
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("Nama              : " + mhs3.getNamaMahasiswa());
		System.out.println("Contact Mahasiswa : ");
		for(NomorKontak kontak : kontakmhs3) {
			
			System.out.println("["+a+"]"+kontak.getNomorKontak());
			a++;
		}
		System.out.println("Kelas             : " + mhs3.getKelas().getNamaKelas());
		System.out.println("Jurusan           : " + mhs3.getJurusan().getNamaJurusan());
		System.out.println("Program Studi     : " + mhs3.getJurusan().getProdi().getNamaProdi());
		mhs1.Waldos(walidosen1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Mahasiswa mhs1 = new Mahsiswa("Gins","sjs",kelas1 );
//		Kelas kelas1 = new Kelas("2ATI",mhs1);
		//Mengatur data mahasiswa
//		LinkedList<Mahasiswa> mhs = new LinkedList<>();
//		Kelas kelas1 = new Kelas("2A-Teknik Informatika",mhs);
		
//		mhs.addFirst(new Mahasiswa("Ridho Alani","201511009",kelas1));
//		mhs.addFirst(new Mahasiswa("Zakiyah Robiyah","201511008",kelas1));
		
		//mengatur nomor kontak dari mahasiswa
		
//		System.out.println("Kelas : " + kelas1.getNamaKelas() );
//		System.out.println("=======================                                                                  ====================");
//		for(Mahasiswa listMhs : kelas1.getMhs()) { //mengambil isi dari mahasiswa yang ada di kelas
//			System.out.print(listMhs.getNamaMahasiswa()); 
//			System.out.println(" ");
//		}
//		
		
		
		
		//Membuat beberapa data Mahasiswa
//		ArrayList<Mahasiswa> mhs = new ArrayList<>();
//		Kelas kelas1 = new Kelas("1",mhs);
//		//association
//		Mahasiswa mhs1 = new Mahasiswa("Robi","20200001",kelas1);
//		Mahasiswa mhs2 = new Mahasiswa("Bima","20200002",kelas1);
//		Mahasiswa mhs3 = new Mahasiswa("Haikal","20200003",kelas1);
//		
//		//masuk ke mhs     ---> Kelas akan menampung beberapa Mhs dibawah ini                                                                                                                     
//		mhs.add(mhs1);              
//		mhs.add(mhs2);
//		mhs.add(mhs3);
//		
//		for(Mahasiswa mahasiswa : kelas1.getMhs()) {
//			System.out.println("Nama     : "+ mahasiswa.getNamaMahasiswa());	
//			System.out.println("Nim		 : "+ mahasiswa.getNim());
//		} 
		
//		IpS ipmhs1= new IpS(3.9);
//		IpS ipmhs2= new IpS(3.8);
//		IpS ipmhs3= new IpS(3.8);
	}

}
