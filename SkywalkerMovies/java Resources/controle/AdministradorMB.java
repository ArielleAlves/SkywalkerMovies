package controle;

import dao.GenericoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Administrador;

@ManagedBean
@ViewScoped
public class AdministradorMB {
	private Administrador administrador = new Administrador();
	private List<Administrador> administradores = new ArrayList<>();
	private GenericoDAO<Administrador> dao = new GenericoDAO<>(Administrador.class);
	
	public AdministradorMB(){
		administradores = dao.buscarTodos();
        } 
}
