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
import modelo.Conteudo;

@ManagedBean
@ViewScoped
public class ConteudoMB {
	private Conteudo conteudo = new Conteudo();
	private List<Conteudo> conteudos = new ArrayList<>();
	private GenericoDAO<Conteudo> dao = new GenericoDAO<>(Conteudo.class);
	
	public ConteudoMB(){
		conteudos = dao.buscarTodos();
        }   
}
