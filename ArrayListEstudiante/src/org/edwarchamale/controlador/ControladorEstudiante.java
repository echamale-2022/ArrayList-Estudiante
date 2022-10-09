package org.edwarchamale.controlador;
import org.edwarchamale.modelo.Estudiante;
import org.edwarchamale.vista.MenusPrincipal;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class ControladorEstudiante {
    public static ArrayList<Estudiante> arregloEstudiante = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    public void agregarEstudiante(String nombre, String apellido, int edad, String grado, int carnet){
        arregloEstudiante.add(new Estudiante(nombre, apellido, edad, grado, carnet));
    }
    public void mostrarEstudiantes(){
        System.out.println("**************************");
        System.out.println("* REPORTE DE ESTUDIANTES *");
        System.out.println("**************************");
            for(Estudiante e: arregloEstudiante){
                System.out.println("***********************************************");
                System.out.println("El numero de carnet: " + e.getCarnet());
                System.out.println("Nombre del estudiante: " + e.getNombre());
                System.out.println("Apellido del estudiante: " + e.getApellido());
                System.out.println("De: " + e.getEdad() + " años");
                System.out.println("De: " + e.getGrado() + " grado");
                System.out.println("***********************************************");
            }
    }
    public void buscarEstudiante(int carnet){
        for(int i = 0; i < arregloEstudiante.size(); i++){
            if(carnet == (arregloEstudiante.get(i).getCarnet())){
                System.out.println("*** Estudiante encontrado ***");
                System.out.println("El numero de carnet: " + arregloEstudiante.get(i).getCarnet());
                System.out.println("Nombre del estudiante: " + arregloEstudiante.get(i).getNombre());
                System.out.println("Apellido del estudiante: " + arregloEstudiante.get(i).getApellido());
                System.out.println("De: " + arregloEstudiante.get(i).getEdad() + " años");
                System.out.println("De: " + arregloEstudiante.get(i).getGrado() + " grado");
                break;
            } else{
                contador ++;
            }
            if(contador == arregloEstudiante.size()){
                System.out.println("*** Estudiante no encontrado ***");
                break;
            }
        }
    }
    public void actualizarEstudiante(int carnet){
        for(int i = 0; i < arregloEstudiante.size(); i++){
            if(carnet == (arregloEstudiante.get(i).getCarnet())){
                System.out.println("¿Que es lo que desea modificar?");
                System.out.println("(carnet/nombre/apellido/edad/grado)");
                String opcion = sc.next();
                    if(opcion.equalsIgnoreCase("carnet")){
                        System.out.println("Ingrese el nuevo carnet");
                        carnet = sc.nextInt();
                        arregloEstudiante.get(i).setCarnet(carnet);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else if(opcion.equalsIgnoreCase("nombre")){
                        System.out.println("Ingrese el nuevo nombre");
                        String nombre = sc.next();
                        arregloEstudiante.get(i).setNombre(nombre);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else if(opcion.equalsIgnoreCase("apellido")){
                        System.out.println("Ingrese el nuevo apellido");
                        String apellido = sc.next();
                        arregloEstudiante.get(i).setApellido(apellido);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else if(opcion.equalsIgnoreCase("edad")){
                        System.out.println("Ingrese la nueva edad");
                        int edad = sc.nextInt();
                            arregloEstudiante.get(i).setEdad(edad);
                            System.out.println("Actualizado exitosamente");
                            break;
                    } else if(opcion.equalsIgnoreCase("grado")){
                        System.out.println("Ingrese el nuevo grado");
                        String grado = sc.next();
                        arregloEstudiante.get(i).setGrado(grado);
                        System.out.println("Actualizado exitosamente");
                        break;
                    } else{
                        System.out.println("No se encuentra lo que quiere modificar");
                    }
            } else{
                contador ++;
            }
            if(contador == arregloEstudiante.size()) {
                System.out.println("Lo que desea actualizar no se encuentra");
            }
        }
    }
    public void eliminarEstudiante(int carnet){
        MenusPrincipal mPrincipal = new MenusPrincipal();
        for(int i = 0; i < arregloEstudiante.size(); i++){
            if(carnet == (arregloEstudiante.get(i).getCarnet())){
                System.out.println("Esta seguro de eliminarlo (si/no)");
                String opcion = sc.next();
                    if(opcion.equalsIgnoreCase("si")){
                        arregloEstudiante.remove(i);
                        System.out.println("Eliminado exitosamente");
                        break;
                    } else{
                        System.out.println("Sera mandado al menu");
                        mPrincipal.menuAdmin();
                        break;
                    }
            } else{
                contador ++;
            }
            if(contador == arregloEstudiante.size()){
                System.out.println("Numero de carnet no encontrado");
                break;
            }
        }
    }
}
