package Balicek;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Zbozi {
    private BigDecimal cena;
    private String popis;
    private LocalDate datumNakupu;

    //region Konstruktor a přístupové metody
    public Zbozi(BigDecimal cena, String popis, LocalDate datumNakupu) throws ZboziException {
        this.cena = cena;
        this.popis = popis;
        this.datumNakupu = datumNakupu;
        setCena(cena);
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) throws ZboziException {
        this.cena = cena;
        if (cena.compareTo(BigDecimal.ZERO) < 0){
            throw new ZboziException("Cena nesmi být záporná - zadáno: " + cena);
        }
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public LocalDate getDatumNakupu() {
        return datumNakupu;
    }

    public void setDatumNakupu(LocalDate datumNakupu) {
        this.datumNakupu = datumNakupu;
    }
    //endregion
}
