package perpustakaan;

public class Buku {
	private int isbn;
    private String namabuku;
    private int jumlah;
    private static int total;
    Buku(int isbn, String namabuku, int jumlah){
        this.isbn = isbn;
        this.namabuku = namabuku;
        this.jumlah = jumlah;
    }
    public int getIsbn(){
    	return isbn;
    }
    
    public int getJumlah(){
    	return jumlah;
    }
    	
    public String getNamabuku(){
    	return namabuku;
    }
    
    public String toString(){
    	return isbn+" "+namabuku+" "+jumlah;
    }
    
    public static int totalbuku() { //Statics methods
    	return (int) total;
    }
}
