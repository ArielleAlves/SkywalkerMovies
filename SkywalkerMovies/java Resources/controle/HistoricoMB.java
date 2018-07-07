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
import modelo.Historico;

@ManagedBean
@ViewScoped
public class HistoricoMB {
	private Historico historico = new Historico();
	private List<Historico> historicos = new ArrayList<>();
	private GenericoDAO<Historico> dao = new GenericoDAO<>(Historico.class);
	
	public HistoricoMB(){
		historicos = dao.buscarTodos();
        }
}
