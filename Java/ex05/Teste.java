import classes.Palestra;
import java.text.SimpleDateFormat;

public class Teste {

  public static void main(String[] args) {
    Palestra palestra = new Palestra();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    try {
      palestra.setDataPalestra(formato);
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("data " + palestra.getDataPalestra());
  }
}
