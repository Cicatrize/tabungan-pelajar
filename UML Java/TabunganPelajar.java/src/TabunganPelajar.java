public class TabunganPelajar
{
    public Rekening Rekeningku;
    public Pelajar nasabah ;
    
    void daftar (Rekeneing Rekeningnasabah, Pelajar nasabahbaru)
    {
        Rekeningku = Rekeningnasabah;
        nasabah = nasabahbaru;
    }
    public double ceksaldo()
    {
        return Rekeningku.ceksaldo();
    }
    void TampilanData()
    {
        System.out.println ("Data Nasabah");
        System.out.println ("Nama : " +nasabah.getNamaOrang());
        System.out.println ("Alamat : " +nasabah.getAlamatOrang());
        System.out.println ("NoKTP : " +nasabah.getNoKTPOrang());
        System.out.println ("NIM : " +nasabah.getNIMOrang());

        System.out.println ("Data Tabungan");
        System.out.println ("NoRekening : " +Rekeningku.getrekeing());
        System.out.println ("SaldoTabungan : " +Rekeningku.ceksaldo());

    }
}
