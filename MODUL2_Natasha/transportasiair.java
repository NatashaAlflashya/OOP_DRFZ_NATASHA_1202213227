public class transportasiair {
    protected int jumlahkursi;
    protected int biaya;
    
    public transportasiair(int jumlahkursi, int biaya){
        this.jumlahkursi = jumlahkursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis dengan tidak diketahui dengan kursi berjumlah" + jumlahkursi + "ditetapkan dengan biaya sebesar Rp" + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi air dengan jenis tidak diketahui sedang berlayar ");
    }

    public void berlabuh(){
        System.out.println("Transportasi air dengan jenis tidak diketahui berlabuh di pantai image.png");
    }

}
