package apptiket;

public class TiketLogik {
    private String id, nama,tujuan;
    private int penumpang, bagasi;
    private double harga,subtotal,pajak,total;
    
    public TiketLogik(){
        id="";
        nama="";
        penumpang=0;
        tujuan="";
        bagasi=0;
        subtotal=0;
        pajak=0;
        total=0;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public void setTujuan(String tujuan){
        this.tujuan=tujuan;
    }
    
    public void setPenumpang(int penumpang){
        this.penumpang=penumpang;
    }
    
    public void setBagasi(int bagasi){
        this.bagasi=bagasi;
    }
    
    public double getPenumpang(){
        return(penumpang);
    }
    
    public double Subtotal(){
        switch(tujuan){
            case "Pare-pare":
                harga=150000;
            break;
            
            case "Toraja":
                harga=200000;
            break;
            
            case "Palopo":
                harga=250000;
            break;
            
            case "Bone":
                harga=300000;
            break;
            default:
                harga=0;
        }
        subtotal=harga*(getPenumpang());
        return(subtotal);
    }
        
    
    public double Pajak(){
        return(0.1*subtotal);
    }
    
    public double Total(){
        return(subtotal+pajak);
    }
}