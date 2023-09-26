package gestion;
import java.util.ArrayList;

public class Zoologico {
  private String nombre;
  private String ubicacion;
  private ArrayList<Zona> zonas = new ArrayList<>();

  public Zoologico() {
    this(null, null);
  }

  public Zoologico(String nombre, String ubicacion){
    this.nombre = nombre;
    this.ubicacion = ubicacion;
  }
}
