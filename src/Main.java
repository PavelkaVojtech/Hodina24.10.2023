import Balicek.Zbozi;
import Balicek.ZboziException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws ZboziException {
        try{
            Zbozi zbozi = new Zbozi(BigDecimal.valueOf(1500), "klávesnice", LocalDate.now());
        }
        catch (ZboziException e){
            System.err.println("nepodařilo se vytvořit objekt zboží: " + e.getLocalizedMessage());
        }
    }
}