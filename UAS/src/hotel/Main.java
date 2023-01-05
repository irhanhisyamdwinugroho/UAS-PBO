package Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("##Welcome to Program Perhotelan ##");
            System.out.println();
            System.out.println("Pilih Akun Kamu :");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.print("Masukan pilihan : ");
            int akun = scanner.nextInt();
            switch (akun) {
                case 1:

                    System.out.println();
                    System.out.println("Welcome Admin Hotel Singaraja");
                    System.out.println("==============================");
                    System.out.println();
                    System.out.println("1. Tampilkan data customer");
                    System.out.println("2. Tambah Kamar");
                    System.out.println("3. tambah pelanggan");
                    System.out.println("4. Jumlah pendapatan hotel");
                    System.out.println("5. tampilkan data kamar");
                    System.out.println("6. Tampilkan data customer");
                    System.out.println("7. Keluar");
                    System.out.print("Masukan pilihan : ");
                    int menu1 = scanner.nextInt();

                    switch (menu1) {

                        case 1:
                            hotel.showCustomers();
                            break;

                        case 2:
                            System.out.print("Masukkan nomor kamar: ");
                            int number = scanner.nextInt();
                            System.out.print("Masukkan tipe kamar: ");
                            String type = scanner.next();
                            System.out.print("Masukkan harga kamar: ");
                            int price = scanner.nextInt();
                            hotel.addRoom(number, type, price);
                            System.out.println("Kamar berhasil ditambahkan.");
                            break;

                        case 3:
                            System.out.print("Masukkan nama customer: ");
                            String name = scanner.next();
                            System.out.print("Masukkan alamat customer: ");
                            String address = scanner.next();
                            System.out.print("Masukkan nomor telepon customer: ");
                            String phone = scanner.next();
                            hotel.addCustomer(name, address, phone);
                            System.out.println("Customer berhasil ditambahkan.");
                            break;
                        case 4:
                            hotel.showIncome();
                            break;
                        case 5:
                            hotel.showRooms();
                            break;
                        case 6:
                            hotel.showCustomers();
                            break;
                        case 7:
                            //keluar program
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                            break;
                    }
                    break;

                case 2:

                    System.out.println();
                    System.out.println();
                    System.out.println("Welcome Customer  Hotel Singaraja");
                    System.out.println("==============================");
                    System.out.println();
                    System.out.println("1. cari Kamar");
                    System.out.println("2. tampilkan data customer");
                    System.out.println("3. keluar");
                    System.out.print("masukkan pilihan : ");
                    int menu2 = scanner.nextInt();

                    switch (menu2) {
                        case 1:
                            System.out.print("Masukkan nomor kamar: ");
                            int number = scanner.nextInt();
                            System.out.print("Masukkan nama customer: ");
                            String name = scanner.next();
                            System.out.print("Masukkan jumlah hari: ");
                            int days = scanner.nextInt();
                            hotel.bookRoom(number, name, days);
                            break;
                        case 2:
                            //keluar program
                            hotel.showCustomers();
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Menu yang anda pilih tidak tersedia");
                            break;
                    }
            }
        }
    }
}
