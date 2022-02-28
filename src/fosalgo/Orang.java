package fosalgo;

public class Orang {
    String nama;
    String alamat;
    int umur;

    public Orang(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
    @Override
    public String toString(){
        return "[ "+nama +" | "+alamat+" | "+umur+" ]";
    }
}
