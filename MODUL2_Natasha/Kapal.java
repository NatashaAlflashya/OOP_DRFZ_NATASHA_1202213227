public class Kapal {
    protected String mesin;
    
    
    public Kapal(int jumlahkursi, int biaya, String mesin){
        this.jumlahkursi = jumlahkursi;
        this.biaya = biaya;
        this.mesin = mesin;
    }

    public void informasi(){
        System.out.println("Transportasi air jenis kapal dengan kursi berjumlah" + jumlahkursi + "ditetapkan dengan biaya sebesar Rp" + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan){
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan mesin" + mesin + "dengan kecepatan stabil dikisaran" + kecepatan);
    }

    public void berlabuh(){
        System.out.println("Transportasi air jenis kapal berlabuh di Pantai");
    }
}