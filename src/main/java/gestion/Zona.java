package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
  private String nombre;
  private Zoologico zoo;
  private ArrayList<Animal>animales = new ArrayList<>();

  public Zona(String nombre, Zoologico zoo){
    this.nombre = nombre;
    this.zoo = zoo
  }

}
