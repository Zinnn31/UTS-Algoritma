import java.util.ArrayList;

public class tokopedia {
    public static class entiti{
        private String fotoBarang;
        private  String deskripsi;
        private String hargabarang;
        private  String asalBarang;
        private String statusStock;

        public entiti(){
        }

        public entiti (String fotoBarang,String deskripsi,String hargabarang,String asalBarang,String statusStock){
            this.fotoBarang = fotoBarang;
            this.deskripsi = deskripsi;
            this.hargabarang = hargabarang;
            this.asalBarang = asalBarang;
            this.statusStock = statusStock;
        }
        public String getFotoBarang(){return this.fotoBarang;}
        public void setFotoBarang(String  fotoBarang){this.fotoBarang = fotoBarang;}
        public  String getDeskripsi(){return  this.deskripsi;}
        public void setDeskripsi(String deskripsi){this.deskripsi = deskripsi;}
        public String getHargabarang(){return  this.hargabarang;}
        public void setHargabarang(String hargabarang){this.hargabarang = hargabarang;}
        public  String getAsalBarang(){return this.asalBarang;}
        public void  setAsalBarang(String asalBarang){this.asalBarang = asalBarang;}
        public String getStatusStock(){return  this.statusStock;}
        public  void  setStatusStock(String statusStock){this.statusStock = statusStock;}
    }

    public static void main(String[] args) {
        ArrayList<entiti> tokped = new ArrayList<>();
        entiti produk = new entiti();
        produk.setFotoBarang("Cyrayon Joyko");
        produk.setDeskripsi("12 warna");
        produk.setHargabarang("Rp 5000");
        produk.setAsalBarang("Jakarta Utara");
        produk.setStatusStock("Segera habis");
        tokped.add(produk);

        produk = new entiti("Crayon","12 warna","Rp 5000","Jakarta Utara","Segera habis");
        tokped.add(produk)
    }
}
