package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
  private static ArrayList<Ave> listado = new ArrayList<>();
  private String colorPlumas;
  public static int halcones;
  public static int aguilas;

  public Ave() {
    this(null, 0, null, null, null);
  }
  
  public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
    super(nombre, edad, habitat, genero);
    this.colorPlumas = colorPlumas;
    Ave.listado.add(this);
  }
}
