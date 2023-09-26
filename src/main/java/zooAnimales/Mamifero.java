package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
  private static ArrayList<Mamifero> listado = new ArrayList<>();
  public static int caballos = 0;
  public static int leones = 0;
  private boolean pelaje;
  private int patas;

  public Mamifero(){
    this(null, 0, null, null, false, 0);
  }
  
  public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
    super(nombre, edad, habitat, genero);
    this.pelaje = pelaje;
    this.patas = patas;
    Mamifero.listado.add(this);
  }
  
}
