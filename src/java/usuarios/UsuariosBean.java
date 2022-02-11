package usuarios;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alejandra
 */
@Named("usuariosBean")
@RequestScoped
public class UsuariosBean {

    private String usuarios;
    private String contraseñas;

    public String getUsuarios() {
        return usuarios;
    }

    public String getContraseñas() {
        return contraseñas;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public void setContraseñas(String contraseñas) {
        this.contraseñas = contraseñas;
    }

    public String getRespuesta() {              
        if (usuarios != null && contraseñas != null) {
            return "<p>Usuarios:" + usuarios + "<br/>Contraseña:" + contraseñas + "</p>";
        }
        return "hola";
    }
}
