/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.GenericoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Pagamento;

@ManagedBean
@ViewScoped
public class PagamentoMB {
	private Pagamento pagamento = new Pagamento();
	private List<Pagamento> pagamentos = new ArrayList<>();
	private GenericoDAO<Pagamento> dao = new GenericoDAO<>(Pagamento.class);
	
	public PagamentoMB(){
		pagamentos = dao.buscarTodos();
	}  
}
