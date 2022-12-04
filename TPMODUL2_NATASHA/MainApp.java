public class MainApp {
    public static void main(String[] args) {
        // Deklarasi
        Perangkat perangkat1 = new Perangkat("Adata",2,(float)1.80);
        Laptop laptop1 = new Laptop("Seagate", 8, (float)2.40, false);
        Handphone handphone1 = new Handphone("Sandisk",3,(float)2.20,false);

        perangkat1.informasi();
        System.out.println();
        laptop1.informasi();
        laptop1.bukaGame("hayday");
        laptop1.kirimEmail("natashaalflashya@student.telkomuniversity.com");
        laptop1.kirimEmail("natashaalflasya@gmail.com","nanatashaak18@gmail.com");

        System.out.println();
        handphone1.informasi();
        handphone1.telfon(62813907);
        handphone1.kirimSMS(628938845, 628185779);
    }
}
