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
import modelo.DependenteCliente;

@ManagedBean
@ViewScoped
public class DependenteClienteMB {
	private DependenteCliente dependenteCliente = new DependenteCliente();
	private List<DependenteCliente> dependenteClientes = new ArrayList<>();
	private GenericoDAO<DependenteCliente> dao = new GenericoDAO<>(DependenteCliente.class);
	
	public DependenteClienteMB(){
		dependenteClientes = dao.buscarTodos();
        } 
}
