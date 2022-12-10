public class sampan {
    protected int layar;
    
    public sampan(int jumlahkursi, int biaya, int layar){
        this.jumlahkursi = jumlahkursi;
        this.biaya = biaya;image.png
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis sampan dengan kursi berjumlah" + jumlahkursi + "ditetapkan dengan biaya sebesar Rp" + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan"  + layar "layar");
    }

    public void berlabuh(){
        System.out.println("Transportasi air jenis sampan sedang berlabuh di pantai tanpa jangkar"){
    }

    public void berlabuh(int jangkar){
        System.out.println("Transportasi air jenis sampan berlabuh di Pantai menggunakan" + jangkar);
    }
}
