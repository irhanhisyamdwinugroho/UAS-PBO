package perpustakaan;

import java.util.*;

public class Main {
	static int index;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Buku> c = new ArrayList<Buku>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int pilihan;
		do {
			System.out.println("|       Sistem Perpustakaan     |");
			System.out.println("|	1. Tambah data buku     |");
			System.out.println("|	2. Tampilkan data buku  |");
			System.out.println("|	3. Hapus data buku      |");
			System.out.println("|	4. Ubah data buku       |");
			System.out.println("|	3. Total buku           |");
			System.out.print("Masukan pilihan anda : ");
			pilihan = s.nextInt();

			switch (pilihan) {
				case 1:
					System.out.print("Masukan ISBN buku : ");
					int isbn = s.nextInt();
					System.out.print("Masukan nama buku : ");
					String namabuku = s1.nextLine();
					System.out.print("Masukan jumlah buku : ");
					int jumlah = s.nextInt();
					c.add(new Buku(isbn, namabuku, jumlah));
					break;
				case 2:
					if(c.size() == 0) {
						System.out.println("|      Data Kosong       |");
					} else {
						System.out.println("--------------------------");
						Iterator<Buku> i = c.iterator();
						while (i.hasNext()) {
							Buku e = i.next();
							System.out.println(e);
						}
						System.out.println("--------------------------");
					}
					break;
				case 3:
					int index = 0;
					int total = 0;
					if(c.size() == 0) {
						System.out.println("|      Data Kosong       |");
					} else {
						for(index=0;index<c.size();index++)
						{
							total+=c.get(index).getJumlah();
						}
						System.out.println(total);
					}
					break;

			}
		} while (pilihan != 0);

	}
}
