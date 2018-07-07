package controle;

import dao.GenericoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ClienteTitular;

@ManagedBean
@ViewScoped
public class ClienteTitularMB {
	private ClienteTitular clienteTitular = new ClienteTitular();
	private List<ClienteTitular> clientesTitulares = new ArrayList<>();
	private GenericoDAO<ClienteTitular> dao = new GenericoDAO<>(ClienteTitular.class);
	
	public ClienteTitularMB(){
		clientesTitulares = dao.buscarTodos();
        }    
}
