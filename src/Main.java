import datas.Aldea;

import java.util.Scanner;

public class Main {
    static Aldea mapaAldea = new Aldea();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            //Vamos a mostrar un menu
            System.out.println("**** MENÚ PARA ARREGLO DE UN COCHE **** ");
            System.out.println("1.Aire acondicionado");
            System.out.println("2.Cambiar ruedas");
            System.out.println("3. Echar gasolina");
            //..... y todas las opciones que quiera o necesite
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            //Dentro del bucle hacemos un switch
            switch (opcion) {
                case 1:
                    //Aquí se cambia el aire acondicionado
                    System.out.println("Aire acondicionado cambiado");
                    break;
                case 2:
                    //Aquí se cambian las ruedas
                    System.out.println("Ruedas cambiadas");
                    break;
                case 3:
                    //Aquí se echa gasolina
                    System.out.println("Depósito lleno");
                    break;
                default:
                    System.out.println("Salir, hasta luego");
            }
        } while(opcion != 0);
    }
}
