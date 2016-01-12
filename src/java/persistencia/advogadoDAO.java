/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.advogado;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RenaTha
 */
public class advogadoDAO {
    
     private final Session sessao;
    
    public advogadoDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void incluir(advogado a) {
        Transaction t = sessao.beginTransaction();
        sessao.save(a);
        t.commit();
    }
    
    public void alterar(advogado a) {
        Transaction t = sessao.beginTransaction();
        sessao.update(a);
        t.commit();
    }
    
    public void excluir(advogado a) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(a);
        t.commit();
    }
    
    public advogado carregar(int id) {
        return (advogado) sessao.get(advogado.class, id);
    }
    
    public List<advogado> listar() {
        return sessao.createCriteria(advogado.class).list();
    }
    
}
