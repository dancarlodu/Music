package Sustentacion;

import BaseDatos.Adm_TarjetaCredito_DB;
import TiendaMusik.TarjetaCredita;
import java.util.Scanner;

/*
 @author Castel...
 */
public class Sustentacion {

    public static void main(String[] args) {
        Adm_TarjetaCredito_DB creditoDB = new Adm_TarjetaCredito_DB();
        TarjetaCredita credito = new TarjetaCredita();
        TarjetaCredita credito1 = new TarjetaCredita();
        TarjetaCredita credito2 = new TarjetaCredita();
        Scanner leer = new Scanner(System.in);
        int q,w=0;
        while(w==0){
        System.out.println("MENU");
        System.out.println("1)Crear");
        System.out.println("2)Buscar");
        System.out.println("3)Borrar");
        System.out.print("==> ");
        q = leer.nextInt();
        switch (q) {
            case 1: {
                System.out.println("ingrese los datos de la tarjeta de credito");
                System.out.println("ingrese el numero de cuenta");
                credito.setNumcuenta(leer.nextInt());
                System.out.println("ingrese el saldo");
                credito.setSaldo(leer.nextInt());
                creditoDB.crear(credito);
            }break;
            case 2: {
                System.out.println("Buscar");
                System.out.println("ingrese en numero de cuenta");
                credito2.setNumcuenta(leer.nextInt());
                creditoDB.buscar(credito2);
            }break;
            case 3: {
                System.out.println("Borrar");
                System.out.println("ingrese en numero de cuenta");
                credito1.setNumcuenta(leer.nextInt());
                creditoDB.Borrar(credito1);
            }break;
        }
            System.out.println("desea continuar = 0  /n desea salir = 1");
            w=leer.nextInt();
      }
    }

}
