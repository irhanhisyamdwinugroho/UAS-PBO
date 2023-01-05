package com.hotel;

import java.util.ArrayList;

class Hotel {
    private ArrayList<Customer> customers;
    private ArrayList<Room> rooms;

    public Hotel() {
        customers = new ArrayList<>();
        rooms = new ArrayList<>();
    }
    // Method untuk menambahkan customer baru
    public void addCustomer(String name, String address, String phone) {
        Customer newCustomer = new Customer(name, address, phone);
        customers.add(newCustomer);
    }

    // Method untuk menampilkan data customer
    public void showCustomers() {
        for (Customer c : customers) {
            System.out.println("Nama: " + c.getName());
            System.out.println("Alamat: " + c.getAddress());
            System.out.println("Telepon: " + c.getPhone());
            System.out.println();
        }
    }

    // Method untuk menambahkan kamar baru
    public void addRoom(int number, String type, int price) {
        Room newRoom = new Room(number, type, price);
        rooms.add(newRoom);
    }

    // Method untuk menampilkan data kamar
    public void showRooms() {
        for (Room r : rooms) {
            System.out.println("Nomor Kamar: " + r.getNumber());
            System.out.println("Tipe Kamar: " + r.getType());
            System.out.println("Harga Kamar: " + r.getPrice());
            System.out.println();
        }
    }

    // Method untuk melakukan pemesanan kamar
    public void bookRoom(int roomNumber, String customerName, int days) {
        // Cari kamar yang akan dipesan
        Room bookedRoom = null;
        for (Room r : rooms) {
            if (r.getNumber() == roomNumber) {
                bookedRoom = r;
                break;
            }
        }

        // Cari customer yang akan memesan
        Customer bookedCustomer = null;
        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                bookedCustomer = c;
                break;
            }
        }

        if (bookedRoom != null && bookedCustomer != null) {
            // Beri tahu customer bahwa kamar telah dipesan
            System.out.println("Kamar nomor " + bookedRoom.getNumber() + " telah dipesan oleh " + bookedCustomer.getName() + " selama " + days + " hari.");

            // Hitung harga yang harus dibayar oleh customer
            int totalPrice = bookedRoom.getPrice() * days;
            System.out.println("Total harga yang harus dibayar adalah: " + totalPrice);
        } else {
            System.out.println("Maaf, kamar atau customer tidak ditemukan.");
        }
    }

    // Method untuk menampilkan jumlah pendapatan hotel
    public void showIncome() {
        int totalIncome = 0;
        for (Room r : rooms) {
            totalIncome += r.getPrice();
        }
        System.out.println("Jumlah pendapatan hotel adalah: " + totalIncome);
    }
}
