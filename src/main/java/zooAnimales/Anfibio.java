package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
  private static ArrayList<Anfibio> listado = new ArrayList<>();
  private String colorPiel;
  private boolean venenoso;
  public static int ranas;
  public static int salamandras;

  public Anfibio() {
    this(null, 0, null, null, null, false);
  }
  
  public Anfibio(String nombre, String edad, String habitat, String genero, String colorPiel, boolean venenoso){
    super(nombre, edad, habitat, genero);
    this.colorPiel = colorPiel;
    this.venenoso = venenoso;
    Anfibio.listado.add(this);
  }
}
