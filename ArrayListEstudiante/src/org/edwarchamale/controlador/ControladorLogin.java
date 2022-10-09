package org.edwarchamale.controlador;
import org.edwarchamale.modelo.Usuario;
import org.edwarchamale.vista.MenusPrincipal;
import java.util.ArrayList;
/**
 *
 * @author Edwar
 */
public class ControladorLogin {
    int contador = 0;
        
    public void verificarUsuario(String usuario, String clave){
        MenusPrincipal mPrincipal = new MenusPrincipal();
        ArrayList<Usuario> arregloUsuario = new ArrayList<>();
        arregloUsuario.add(new Usuario("admin@gmail", "123", 'a'));// rol a = administrador
        arregloUsuario.add(new Usuario("jose@gmail", "456", 'b'));// rol b = basico
        for(int i = 0; i < arregloUsuario.size(); i++){
            if(usuario.equals(arregloUsuario.get(i).getUsuario()) && clave.equals(arregloUsuario.get(i).getClave())){
                if(usuario.charAt(i) != '@'){
                    if(arregloUsuario.get(i).getRol() == 'a'){
                        mPrincipal.menuAdmin();
                        break;
                    } else{
                        mPrincipal.menuBasico();
                        break;
                    }
                } else{
                    System.out.println("No se encuentra el '@'");
                }
            } else{
                contador ++;
            }
            if(contador == arregloUsuario.size()){
                System.out.println("Error de credenciales");
            }
        }
    }
}
