/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.cliente;

/**
 *
 * @author RenaTha
 */
public class clienteDAO {
    
    private final Session sessao;
    
    public clienteDAO() {
        sessao = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void incluir(cliente c) {
        Transaction t = sessao.beginTransaction();
        sessao.save(c);
        t.commit();
    }
    
    public void alterar(cliente c) {
        Transaction t = sessao.beginTransaction();
        sessao.update(c);
        t.commit();
    }
    
    public void excluir(cliente c) {
        Transaction t = sessao.beginTransaction();
        sessao.delete(c);
        t.commit();
    }
    
    public cliente carregar(int id) {
        return (cliente) sessao.get(cliente.class, id);
    }
    
    public List<cliente> listar() {
        return sessao.createCriteria(cliente.class).list();
    }
    
}
