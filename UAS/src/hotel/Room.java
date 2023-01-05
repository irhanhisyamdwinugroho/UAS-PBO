package com.Hotel;


// Kelas Room untuk menyimpan data kamar
class Room {
    private int number;
    private String type;
    private int price;

    public Room(int number, String type, int price) {
        this.number = number;
        this.type = type;
        this.price = price;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
