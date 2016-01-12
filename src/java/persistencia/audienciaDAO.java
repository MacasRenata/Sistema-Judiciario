/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.audiencia;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RenaTha
 */
public class audienciaDAO {
    
     private final Session sessao;
    
    public audienciaDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void incluir(audiencia d) {
        Transaction t = sessao.beginTransaction();
        sessao.save(d);
        t.commit();
    }
    
    public void alterar(audiencia d) {
        Transaction t = sessao.beginTransaction();
        sessao.update(d);
        t.commit();
    }
    
    public void excluir(audiencia d) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(d);
        t.commit();
    }
    
    public audiencia carregar(int id) {
        return (audiencia) sessao.get(audiencia.class, id);
    }
    
    public List<audiencia> listar() {
        return sessao.createCriteria(audiencia.class).list();
        
    }
}
