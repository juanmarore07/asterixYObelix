import datas.Aldea;
import datas.Aldeano;

import java.util.*;

public class Main {
    static Aldea mapaAldea = new Aldea();
    public static void main(String[] args) {
        mapaAldea.escribirDatosFichero();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            //Vamos a mostrar un menu
            System.out.println("**** MENÚ ALDEA **** ");
            System.out.println("1. Agregar aldeano");
            System.out.println("2. Eliminar aldeano");
            System.out.println("3. Ordenar en función del valor");
            System.out.println("4. Buscar aldeano por nombre");
            System.out.println("5. Buscar aldeano por profesión");
            System.out.println("6. Mostrar todos los aldeanos");
            System.out.println("7. Expulsar aldeano de manera aleatoria");
            System.out.println("8. Guardar y salir");
            //..... y todas las opciones que quiera o necesit
            opcion = sc.nextInt();
            //Dentro del bucle hacemos un switch
            switch (opcion) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    opcion3();
                    break;
                case 4:
                    ocpion4();
                break;
                case 6:
                    System.out.println(mapaAldea.getMapaAladeanos());
                    break;
                default:
                if (opcion != 8) {
                        System.out.println("Opción inválida introducida");
                }
            }
        } while(opcion != 0);
    }

    private static void ocpion4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del aldeano:");
        String nombre = sc.next();
        List<Map.Entry<Integer, Aldeano>> entryList = new ArrayList<>(mapaAldea.getMapaAladeanos().entrySet());
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<Integer, Aldeano> entry = entryList.get(i);
            if (entry.getValue().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(mapaAldea.getMapaAladeanos().get(entry.getKey()));
                break;
            }
        }
    }

    private static void opcion3() {

    }

    public static void opcion1() {
        if(mapaAldea.getNombre() == null) {
            // Creación de objetos individuales
            Scanner sc = new Scanner(System.in);
            System.out.println("Nombre de la aldea:");
            String nombre = sc.next();

            mapaAldea.setNombre(nombre);
            Aldeano a1 = new Aldeano("Asterix", "Guerrero", 550);
            Aldeano a2 = new Aldeano("Obelix", "Repartidor de menhires", 1200);
            Aldeano a3 = new Aldeano("Panoramix", "Druida", 25);
            Aldeano a4 = new Aldeano("Abraracurcix", "Jefe de la aldea", 150);
            Aldeano a5 = new Aldeano("Asuranceturix", "Bardo", 0);
            Aldeano a6 = new Aldeano("Edadepiedrix", "Veterano", 80);

            // Inserción en el mapa usando las variables
            mapaAldea.getMapaAladeanos().put(1, a1);
            mapaAldea.getMapaAladeanos().put(2, a2);
            mapaAldea.getMapaAladeanos().put(3, a3);
            mapaAldea.getMapaAladeanos().put(4, a4);
            mapaAldea.getMapaAladeanos().put(5, a5);
            mapaAldea.getMapaAladeanos().put(6, a6);

        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el ID:");
            int id = sc.nextInt();

            System.out.println("Escriba el nombre del aldeano:");
            String nombre = sc.next();

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Escriba la profesión del aldeano:");
            String profesion = sc.next();

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Escriba la cantidad de romanos derrotados por el aldeano:");
            int romanosDerrotados = sc.nextInt();
            Aldeano nuevo = new Aldeano(nombre, profesion, romanosDerrotados);
            mapaAldea.getMapaAladeanos().put(id, nuevo);
        }
    }

    private static void opcion2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del aldeano:");
        String nombre = sc.next();
        List<Map.Entry<Integer, Aldeano>> entryList = new ArrayList<>(mapaAldea.getMapaAladeanos().entrySet());
        for (int i = 0; i < entryList.size(); i++) {
            Map.Entry<Integer, Aldeano> entry = entryList.get(i);
            if (entry.getValue().getNombre().equalsIgnoreCase(nombre)) {
                mapaAldea.getMapaAladeanos().remove(entry.getKey());
                break;
            }
        }
    }
}
