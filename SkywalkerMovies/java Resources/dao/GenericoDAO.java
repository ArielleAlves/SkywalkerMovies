package dao;

import Fabrica.Conexao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class GenericoDAO<T> {
    	 private EntityManager manager;
	 private Class<T> tipoClasse;
	 
	 public GenericoDAO(Class<T> tipoClasse) {
		 this.tipoClasse  = tipoClasse;
         }
	 
        public T salvar(T entidade) {		 
                    manager = Conexao.get().createEntityManager();
 
		 EntityTransaction t = manager.getTransaction();
		 try {
			 t.begin();
			 manager.persist(entidade);
			 t.commit();
		 }		 
		 catch(Exception e){
			 t.rollback();
			 e.printStackTrace();		 
		 }		 
		 finally {
			 manager.close();
		 }
		 return entidade;
	 }
	 

	public T alterar(T entidade) {
		manager = Conexao.get().createEntityManager();
		EntityTransaction t = manager.getTransaction();

		try {
			t.begin();
			manager.merge(entidade);
			t.commit();
		}

		catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		finally {
			manager.close();
		}
		return entidade;
	}

	public boolean excluir(long id) {
		manager = Conexao.get().createEntityManager();
		EntityTransaction t = manager.getTransaction();

		try {
			t.begin();
			T entidade = manager.find(tipoClasse, id);
			t.commit();

			if (entidade != null) {
				manager.remove(entidade);					
			} 
			t.commit();
			return true;
		}
		catch (Exception e) {
			t.rollback();
			e.printStackTrace();
			return false;
		}

		finally {
			manager.close();
		}
	}

	public T consultar(long id) {
		manager = Conexao.get().createEntityManager();
		return manager.find(tipoClasse, id);
		}

	public List<T> buscarTodos() {
		manager = Conexao.get().createEntityManager();

		try {
			return manager.createQuery("from entidade").getResultList();
		}

		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		finally {
			manager.close();
		}
	}
}

