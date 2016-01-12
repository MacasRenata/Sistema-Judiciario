/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


/**
 *
 * @author RenaTha
 */

@Entity
public class processo implements Serializable {

@Id
@GeneratedValue
private int codigo;
private String descricao;
private Date dataDeAbertura;


@ManyToOne
private cliente cliente;

@ManyToMany(mappedBy="processos")
private List<advogado> advogados;

@OneToMany(mappedBy="processo")
private List<audiencia> audiencias;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataDeAbertura
     */
    public Date getDataDeAbertura() {
        return dataDeAbertura;
    }

    /**
     * @param dataDeAbertura the dataDeAbertura to set
     */
    public void setDataDeAbertura(Date dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

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
     * @return the advogados
     */
    public List<advogado> getAdvogados() {
        return advogados;
    }

    /**
     * @param advogados the advogados to set
     */
    public void setAdvogados(List<advogado> advogados) {
        this.advogados = advogados;
    }

    /**
     * @return the audiencias
     */
    public List<audiencia> getAudiencias() {
        return audiencias;
    }

    /**
     * @param audiencias the audiencias to set
     */
    public void setAudiencias(List<audiencia> audiencias) {
        this.audiencias = audiencias;
    }


}
