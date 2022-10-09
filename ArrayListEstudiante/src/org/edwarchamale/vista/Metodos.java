package org.edwarchamale.vista;
import org.edwarchamale.controlador.ControladorLogin;
import org.edwarchamale.controlador.ControladorEstudiante;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class Metodos {
    Scanner sc = new Scanner(System.in);
    ControladorEstudiante cEstudiante = new ControladorEstudiante();
    String usuario;
    String clave;
    String opcion;
    int carnet = 2022000;
    public void iniciarSesion(){
        ControladorLogin cLogin = new ControladorLogin();
        System.out.println("Ingrese su usuario");
        usuario = sc.next();
        System.out.println("Ingrese su clave");
        clave = sc.next();
        cLogin.verificarUsuario(usuario, clave);
    }
    public void agregarEstudiante(){
        do{
            carnet++;
            System.out.println("**********************");
            System.out.println("* Ingreso estudiante *");
            System.out.println("**********************");
            System.out.println("Ingrese su nombre");
            String nombre = sc.next();
            System.out.println("Ingrese su apellido");
            String apellido = sc.next();
            System.out.println("Ingrese su edad");
            int edad = sc.nextInt();
                if(edad >= 0 && edad >= 60){
                    System.out.println("Edad no validad");
                } else{
                    System.out.println("Ingrese su grado");
                    String grado = sc.next();
                    cEstudiante.agregarEstudiante(nombre, apellido, edad, grado, carnet);
                }
                System.out.println("¿Desea agregar otro (si/no)?");
                opcion = sc.next();
        } while(opcion.toLowerCase().equals("si"));
    }
    public void reporteEstudiantes(){
        cEstudiante.mostrarEstudiantes();
    }
    public void actualizarEstudiante(){
        System.out.println("Ingrese el numero de carnet a actualizar");
        carnet = sc.nextInt();
        cEstudiante.actualizarEstudiante(carnet);
    }
    public void buscarEstudiante(){
        do{
        System.out.println("Ingrese el carnet a buscar");
        carnet = sc.nextInt();
        cEstudiante.buscarEstudiante(carnet);
        System.out.println("¿Desea buscar otro (si/no)?");
        opcion = sc.next();
        }while(opcion.toLowerCase().equals("si"));
    }
    public void eliminarEstudiante(){
        System.out.println("Ingrese el carnet a eliminar");
        carnet = sc.nextInt();
        cEstudiante.eliminarEstudiante(carnet);
    }
}
