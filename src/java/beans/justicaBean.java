/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import modelo.cliente;
import modelo.advogado;
import modelo.processo;
import modelo.audiencia;

import persistencia.clienteDAO;
import persistencia.advogadoDAO;
import persistencia.audienciaDAO;
import persistencia.processoDAO;


/**
 *
 * @author RenaTha
 */

@ManagedBean
@SessionScoped
public class justicaBean {
    
    private cliente cliente = new cliente();
    private advogado advogado = new advogado();
    private processo processo = new processo();
    private audiencia audiencia = new audiencia();

    
    private clienteDAO clienteDAO = new clienteDAO();
    private advogadoDAO advogadoDAO = new advogadoDAO();
    private processoDAO processoDAO = new processoDAO();
    private audienciaDAO audienciaDAO = new audienciaDAO();
   

    private List<cliente> listacliente;
    private int idclienteSelecionado;
    private int[] listaclienteSelecionado;
    
    private List<advogado> listaadvogado;
    private int idadvogadoSelecionado;
    private int[] listaadvogadoSelecionado;
   
    private List<processo> listaprocesso;
    private int idprocessoSelecionado;
    private int[] listaprocessoSelecionado;
   
    
    private List<audiencia> listaaudiencia;
    private int idaudienciaSelecionado;
    private int[] listaaudienciaSelecionado;
    
    
     /* backEnd */
    
    /* cliente */
     public String iniciarInclusaocliente() {
        setCliente(new cliente());
        return "cadastrocliente";
    }
    
    public String incluircliente() {
        getClienteDAO().incluir(getCliente());
        FacesContext.getCurrentInstance().addMessage
        (null, new FacesMessage
        (FacesMessage.SEVERITY_INFO, "Cliente cadastrado com sucesso!", ""));
        setCliente(new cliente());
        return null;
        
    }
    
    public String consultacliente() {
        setCliente(getClienteDAO().carregar(getIdclienteSelecionado()));
        return "consultacliente2";
    }
    
    public List<cliente> getListaAluno() {
        return getClienteDAO().listar();
    }
    
     /* advogado */
    
     public String iniciarInclusaoadvogado() {
        setAdvogado(new advogado());
        return "cadastroadvogado";
    }
    
    public String incluiradvogado() {
        getAdvogadoDAO().incluir(getAdvogado());
        FacesContext.getCurrentInstance().addMessage
        (null, new FacesMessage
        (FacesMessage.SEVERITY_INFO, "Advogado cadastrado com sucesso!", ""));
        setAdvogado(new advogado());
        return null;
        
    }
    
    
    public List<advogado> getListaadvogado() {
        return getAdvogadoDAO().listar();
    }
    
      /* processo */
    
     public String iniciarInclusaoprocesso() {
        setProcesso(new processo());
        return "cadastroprocesso";
    }
    
    public String incluirprocesso() {
        getProcessoDAO().incluir(getProcesso());
        FacesContext.getCurrentInstance().addMessage
        (null, new FacesMessage
        (FacesMessage.SEVERITY_INFO, "Processo cadastrado com sucesso!", ""));
        setProcesso(new processo());
        return null;
        
    }

    public String consultaprocesso() {
        setProcesso(getProcessoDAO().carregar(getIdprocessoSelecionado()));
        return "consultaprocesso1";
    }
    
    public String consultaprocesso(processo p) {
        processo = p;
        return "consultaprocesso2";
    }
    
    public List<processo> getListaprocesso() {
        return getProcessoDAO().listar();
    }
    
    
      /* audiencia */
    
     public String iniciarInclusaoaudiencia() {
        setAudiencia(new audiencia());
        return "cadastroaudiencia";
    }
    
    public String incluiraudiencia() {
        getAudienciaDAO().incluir(getAudiencia());
        FacesContext.getCurrentInstance().addMessage
        (null, new FacesMessage
        (FacesMessage.SEVERITY_INFO, "Audiencia cadastrado com sucesso!", ""));
        setAudiencia(new audiencia());
        return null;
        
    }
    
    
    public String consultaaudiencia() {
        setAudiencia(getAudienciaDAO().carregar(getIdaudienciaSelecionado()));
        return "consultaaudiencia";
    }
    
    public List<audiencia> getListaaudiencia() {
        return getAudienciaDAO().listar();
    }
    
    /* fim BackEnd*/

    /**
     * @return the cliente
     */
    public cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the advogado
     */
    public advogado getAdvogado() {
        return advogado;
    }

    /**
     * @param advogado the advogado to set
     */
    public void setAdvogado(advogado advogado) {
        this.advogado = advogado;
    }

    /**
     * @return the processo
     */
    public processo getProcesso() {
        return processo;
    }

    /**
     * @param processo the processo to set
     */
    public void setProcesso(processo processo) {
        this.processo = processo;
    }

    /**
     * @return the audiencia
     */
    public audiencia getAudiencia() {
        return audiencia;
    }

    /**
     * @param audiencia the audiencia to set
     */
    public void setAudiencia(audiencia audiencia) {
        this.audiencia = audiencia;
    }

    /**
     * @return the clienteDAO
     */
    public clienteDAO getClienteDAO() {
        return clienteDAO;
    }

    /**
     * @param clienteDAO the clienteDAO to set
     */
    public void setClienteDAO(clienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    /**
     * @return the advogadoDAO
     */
    public advogadoDAO getAdvogadoDAO() {
        return advogadoDAO;
    }

    /**
     * @param advogadoDAO the advogadoDAO to set
     */
    public void setAdvogadoDAO(advogadoDAO advogadoDAO) {
        this.advogadoDAO = advogadoDAO;
    }

    /**
     * @return the processoDAO
     */
    public processoDAO getProcessoDAO() {
        return processoDAO;
    }

    /**
     * @param processoDAO the processoDAO to set
     */
    public void setProcessoDAO(processoDAO processoDAO) {
        this.processoDAO = processoDAO;
    }

    /**
     * @return the audienciaDAO
     */
    public audienciaDAO getAudienciaDAO() {
        return audienciaDAO;
    }

    /**
     * @param audienciaDAO the audienciaDAO to set
     */
    public void setAudienciaDAO(audienciaDAO audienciaDAO) {
        this.audienciaDAO = audienciaDAO;
    }

    /**
     * @return the listacliente
     */
    public List<cliente> getListacliente() {
        return listacliente;
    }

    /**
     * @param listacliente the listacliente to set
     */
    public void setListacliente(List<cliente> listacliente) {
        this.listacliente = listacliente;
    }

    /**
     * @return the idclienteSelecionado
     */
    public int getIdclienteSelecionado() {
        return idclienteSelecionado;
    }

    /**
     * @param idclienteSelecionado the idclienteSelecionado to set
     */
    public void setIdclienteSelecionado(int idclienteSelecionado) {
        this.idclienteSelecionado = idclienteSelecionado;
    }

    /**
     * @return the listaclienteSelecionado
     */
    public int[] getListaclienteSelecionado() {
        return listaclienteSelecionado;
    }

    /**
     * @param listaclienteSelecionado the listaclienteSelecionado to set
     */
    public void setListaclienteSelecionado(int[] listaclienteSelecionado) {
        this.listaclienteSelecionado = listaclienteSelecionado;
    }

    /**
     * @param listaadvogado the listaadvogado to set
     */
    public void setListaadvogado(List<advogado> listaadvogado) {
        this.listaadvogado = listaadvogado;
    }

    /**
     * @return the idadvogadoSelecionado
     */
    public int getIdadvogadoSelecionado() {
        return idadvogadoSelecionado;
    }

    /**
     * @param idadvogadoSelecionado the idadvogadoSelecionado to set
     */
    public void setIdadvogadoSelecionado(int idadvogadoSelecionado) {
        this.idadvogadoSelecionado = idadvogadoSelecionado;
    }

    /**
     * @return the listaadvogadoSelecionado
     */
    public int[] getListaadvogadoSelecionado() {
        return listaadvogadoSelecionado;
    }

    /**
     * @param listaadvogadoSelecionado the listaadvogadoSelecionado to set
     */
    public void setListaadvogadoSelecionado(int[] listaadvogadoSelecionado) {
        this.listaadvogadoSelecionado = listaadvogadoSelecionado;
    }

    /**
     * @param listaprocesso the listaprocesso to set
     */
    public void setListaprocesso(List<processo> listaprocesso) {
        this.listaprocesso = listaprocesso;
    }

    /**
     * @return the idprocessoSelecionado
     */
    public int getIdprocessoSelecionado() {
        return idprocessoSelecionado;
    }

    /**
     * @param idprocessoSelecionado the idprocessoSelecionado to set
     */
    public void setIdprocessoSelecionado(int idprocessoSelecionado) {
        this.idprocessoSelecionado = idprocessoSelecionado;
    }

    /**
     * @return the listaprocessoSelecionado
     */
    public int[] getListaprocessoSelecionado() {
        return listaprocessoSelecionado;
    }

    /**
     * @param listaprocessoSelecionado the listaprocessoSelecionado to set
     */
    public void setListaprocessoSelecionado(int[] listaprocessoSelecionado) {
        this.listaprocessoSelecionado = listaprocessoSelecionado;
    }

    /**
     * @param listaaudiencia the listaaudiencia to set
     */
    public void setListaaudiencia(List<audiencia> listaaudiencia) {
        this.listaaudiencia = listaaudiencia;
    }

    /**
     * @return the idaudienciaSelecionado
     */
    public int getIdaudienciaSelecionado() {
        return idaudienciaSelecionado;
    }

    /**
     * @param idaudienciaSelecionado the idaudienciaSelecionado to set
     */
    public void setIdaudienciaSelecionado(int idaudienciaSelecionado) {
        this.idaudienciaSelecionado = idaudienciaSelecionado;
    }

    /**
     * @return the listaaudienciaSelecionado
     */
    public int[] getListaaudienciaSelecionado() {
        return listaaudienciaSelecionado;
    }

    /**
     * @param listaaudienciaSelecionado the listaaudienciaSelecionado to set
     */
    public void setListaaudienciaSelecionado(int[] listaaudienciaSelecionado) {
        this.listaaudienciaSelecionado = listaaudienciaSelecionado;
    }
    
    
}

