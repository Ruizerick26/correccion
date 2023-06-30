import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        Plantas miplanta = new Plantas();
        Plantas miplanta2 = new Plantas();
        consumo tuplanta = new consumo();
        consumo tuplanta2 = new consumo();

        ArrayList <Plantas> lista1 = new ArrayList<Plantas>();
        ArrayList <consumo> lista2 = new ArrayList<consumo>();
        lista1.add(miplanta);
        lista1.add(miplanta2);

        lista2.add(tuplanta);
        lista2.add(tuplanta2);

        for(Plantas lista : lista1){
            System.out.println("Ingrese el nombre de la planta");
            String nombre = rc.nextLine();
            lista.setNombre(nombre);
            System.out.println("Ingrese el tipo de la planta");
            String tipo = rc.nextLine();
            lista.setTipo(tipo);
            System.out.println("Ingrese el color de la planta");
            String color = rc.nextLine();
            lista.setColor(color);
        }

        for(consumo lista: lista2){
            System.out.println("Ingrese el nombre de la planta");
            String nombre = rc.nextLine();
            lista.setNombre(nombre);
            System.out.println("Ingrese el tipo de la planta");
            String tipo = rc.nextLine();
            lista.setTipo(tipo);
            System.out.println("Ingrese el color de la planta");
            String color = rc.nextLine();
            lista.setColor(color);
            System.out.println("Ingrese el nombre de la familia de la planta");
            String n_familia = rc.nextLine();
            lista.setN_familia(n_familia);
            System.out.println("Ingrese el nombre cientifico de la planta");
            String n_cient = rc.nextLine();
            lista.setN_cientifico(n_cient);
            System.out.println("Ingrese si es consumible o no la planta");
            String consu = rc.nextLine();
            lista.setConsu(consu);
        }
    }
}
