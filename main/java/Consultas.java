import com.example.cristian.muscleregistrationylogin.Dieta;
import com.example.cristian.muscleregistrationylogin.Usuario;
import com.example.cristian.muscleregistrationylogin.dummy.BaseDeDatos;
import com.example.cristian.muscleregistrationylogin.dummy.Tablas;

import java.util.Date;

/**
 * Created by Yeison Fernando on 20/10/2016.
 */

public class Consultas {

    private String rta;
    private String id;
    private String contraseña;
    private Tablas t;
    private String patologias;
    private Dieta dieta;

    public String consultarpatologias(Usuario u, BaseDeDatos b){

        this.id=u.getId();
        this.contraseña=u.getContraseña();
        this.t=b.getT();
        if(t.getPass()==contraseña&&t.getKey()==Integer.parseInt(id)){
            System.out.println("Usuario encontrado");
            patologias=t.getpatologias();
            if(patologias.toString().equals("Gastritis")){
                dieta=consultardieta(patologias,u.gethorarios(),);

            }

        }

        return rta;
    }

    private Dieta consultardieta(String patologias, Date hora,String desayuno,String almuerzo, String cena, String onces, String mediasNueves) {
        dieta = new Dieta(hora,desayuno,almuerzo,cena,onces,mediasNueves);
    }
}
