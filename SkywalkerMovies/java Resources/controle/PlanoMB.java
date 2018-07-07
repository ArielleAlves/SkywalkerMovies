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
import modelo.Plano;


@ManagedBean
@ViewScoped
public class PlanoMB {
	private Plano plano = new Plano();
	private List<Plano> planos = new ArrayList<>();
	private GenericoDAO<Plano> dao = new GenericoDAO<>(Plano.class);
	
	public PlanoMB(){
		planos = dao.buscarTodos();
	}
}
