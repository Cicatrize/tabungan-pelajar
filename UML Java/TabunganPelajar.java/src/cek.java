public class cek {

    public static void main(String[] args)
    {
        Pelajar Mahasiswa = new Pelajar();
        Rekening NoRekening = new Rekening();

        Mahasiswa.setNamaOrang("Fatimah Azahra");
        Mahasiswa.setAlamatOrang("Jakarta");
        Mahasiswa.setNoKTPOrang("3175046312050002");
        Mahasiswa.setNim("1234567890");

        NoRekening.setRekening("1234 5678 9101 1213");
        NoRekening.setDebet("500000");
        Tabungan.daftar(NoRekening, Mahasiswa);
        Tabungan.TampilanDatta();

        System.out.println("\n \n");
        NoRekening.Kredit(200000);
        Tabungan.daftar(NoRekening, Mahasiswa);
        Tabungan.TampilanDatta();

    }
    
}
