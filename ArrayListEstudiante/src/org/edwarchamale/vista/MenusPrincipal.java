package org.edwarchamale.vista;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MenusPrincipal {
    Scanner sc = new Scanner(System.in);
    public void menuAdmin(){
        Metodos metodos = new Metodos();
        System.out.println("**********************");
        System.out.println("* Menú administrador *");
        System.out.println("**********************");
        System.out.println("1.  Agregar estudiante");
        System.out.println("2.  Reporte estudiante");
        System.out.println("3.  Actualizar estudiante");
        System.out.println("4.  Eliminar estudiante");
        System.out.println("5.  Salir del sistema");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1: // agregar estudiante
                    metodos.agregarEstudiante();
                    this.menuAdmin();
                    break;
                case 2:
                    System.out.println("************");
                    System.out.println("* Reportes *");
                    System.out.println("************");
                    System.out.println("1.  Reporte general");
                    System.out.println("2.  Reporte individual");
                    System.out.println("Elija la opcion que desea");
                    int opcion = sc.nextInt();
                        switch(opcion){
                            case 1:
                                metodos.reporteEstudiantes();
                                this.menuAdmin();
                                break;
                            case 2:
                                metodos.buscarEstudiante();
                                this.menuAdmin();
                                break;
                            default:
                                System.out.println("Opcion no validad");
                        }// fin de segundo switch
                    break;
                case 3:
                    metodos.actualizarEstudiante();
                    this.menuAdmin();
                    break;
                case 4:
                    metodos.eliminarEstudiante();
                    this.menuAdmin();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no validad");
            }// fin de primer switch
    }
    public void menuBasico(){
        Metodos metodos = new Metodos();
        System.out.println("***************");
        System.out.println("* Menú básico *");
        System.out.println("***************");
        System.out.println("1.  Agregar estudiante");
        System.out.println("2.  Reporte estudiantes");
        System.out.println("3.  Salir del sistema");
        System.out.println("Elija la opcion que desea");
        int opc = sc.nextInt();
            switch(opc){
                case 1:
                    metodos.agregarEstudiante();
                    this.menuBasico();
                    break;
                case 2:
                    System.out.println("************");
                    System.out.println("* Reportes *");
                    System.out.println("************");
                    System.out.println("1.  Reporte general");
                    System.out.println("2.  Reporte individual");
                    System.out.println("Elija la opcion que desea");
                    int subOpc = sc.nextInt();
                        switch(subOpc){
                            case 1:
                                metodos.reporteEstudiantes();
                                this.menuBasico();
                                break;
                            case 2:
                                metodos.buscarEstudiante();
                                this.menuBasico();
                                break;
                            default:
                                System.out.println("Opcion no validad");
                        }// switch #2
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no validad");
            }// switch #1
    }
}
