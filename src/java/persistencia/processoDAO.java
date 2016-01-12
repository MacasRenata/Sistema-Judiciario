/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.processo;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RenaTha
 */
public class processoDAO {
    
     private final Session sessao;
    
    public processoDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void incluir(processo p) {
        Transaction t = sessao.beginTransaction();
        sessao.save(p);
        t.commit();
    }
    
    public void alterar(processo p) {
        Transaction t = sessao.beginTransaction();
        sessao.update(p);
        t.commit();
    }
    
    public void excluir(processo p) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(p);
        t.commit();
    }
    
    public processo carregar(int id) {
        return (processo) sessao.get(processo.class, id);
    }
    
    public List<processo> listar() {
        return sessao.createCriteria(processo.class).list();
        
    }
    
}
