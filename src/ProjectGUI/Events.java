package ProjectGUI;

public class Events {

    private String baslik;
    private String islemZamani;
    private String baslamaZamani;
    private String olayTanimlamasi;
    private String olayTipi;
    private String olayAciklamasi;
    private String sure;

    public Events() {
    }

    public Events(String baslik, String islemZamani, String baslamaZamani, String olayTanimlamasi, String olayTipi, String olayAciklamasi, String sure) {
        this.baslik = baslik;
        this.islemZamani = islemZamani;
        this.baslamaZamani = baslamaZamani;
        this.olayTanimlamasi = olayTanimlamasi;
        this.olayTipi = olayTipi;
        this.olayAciklamasi = olayAciklamasi;
        this.sure = sure;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIslemZamani() {
        return islemZamani;
    }

    public void setIslemZamani(String islemZamani) {
        this.islemZamani = islemZamani;
    }

    public String getBaslamaZamani() {
        return baslamaZamani;
    }

    public void setBaslamaZamani(String baslamaZamani) {
        this.baslamaZamani = baslamaZamani;
    }

    public String getOlayTanimlamasi() {
        return olayTanimlamasi;
    }

    public void setOlayTanimlamasi(String olayTanimlamasi) {
        this.olayTanimlamasi = olayTanimlamasi;
    }

    public String getOlayTipi() {
        return olayTipi;
    }

    public void setOlayTipi(String olayTipi) {
        this.olayTipi = olayTipi;
    }

    public String getOlayAciklamasi() {
        return olayAciklamasi;
    }

    public void setOlayAciklamasi(String olayAciklamasi) {
        this.olayAciklamasi = olayAciklamasi;
    }

}
