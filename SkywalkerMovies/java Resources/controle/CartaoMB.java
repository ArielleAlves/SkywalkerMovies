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
import modelo.Cartao;

@ManagedBean
@ViewScoped
public class CartaoMB {
	private Cartao cartao = new Cartao();
	private List<Cartao> cartoes = new ArrayList<>();
	private GenericoDAO<Cartao> dao = new GenericoDAO<>(Cartao.class);
	
	public CartaoMB(){
		cartoes = dao.buscarTodos();
        } 
}
