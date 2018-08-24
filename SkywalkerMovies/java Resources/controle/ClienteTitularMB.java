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
	private ClienteTitular cTitular = new ClienteTitular();
	private List<ClienteTitular> clientesTitulares = new ArrayList<>();
	private GenericoDAO<ClienteTitular> dao = new GenericoDAO<>(ClienteTitular.class);
	
	public ClienteTitularMB(){
		clientesTitulares = dao.buscarTodos();
        }    
        
        
        public void inserir() {
		if (cTitular.getId_cliente() == null) {
			dao.salvar(cTitular);
		}
	}
          
        public List<ClienteTitular> getClienteTitular(){
            return clientesTitulares;
        }
        
        public void setClienteTitular(List<ClienteTitular> clientesTitulares){
            this.clientesTitulares = clientesTitulares;
        }
        
        public ClienteTitular getcTitular(){
            return cTitular;
        }
        
        public void setCTitular(ClienteTitular clienteTitular){
            this.cTitular = clienteTitular;
        }
}
