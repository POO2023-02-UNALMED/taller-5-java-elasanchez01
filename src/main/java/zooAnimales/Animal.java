package zooAnimales;
import gestion.Zona;

public class Animal {
  private static int totalAnimales;
  private String nombre;
  private int edad;
  private String genero;
  private String habitad;
  private Zona zona;

  public Animal(){
    this(null, 0, null, null);
  }

  public Animal(String nombre, int edad, String habitad, String genero){
    this.nombre = nombre;
    this.edad = edad;
    this.habitad = habitad;
    this.genero = genero;
    this.zona = null;
    totalAnimales++;
  }
  
  public static void setTotalAnimales(int totalAnimales){
   Animal.totalAnimales = totalAnimales;
 }

  public static void getTotalAnimales(){
    return totalAnimales;
  }
  public static String totalPorTipo() {
    return "Mamiferos: "+Mamifero.getListado().size()+"\n"+
      "Aves: "+Ave.getListado().size()+"\n"+
      "Reptiles: "+Reptil.getListado().size()+"\n"+
      "Peces: "+Pez.getListado().size()+"\n"+
      "Anfibios: "+Anfibio.getListado().size();
  }
}
