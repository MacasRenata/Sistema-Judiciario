/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author RenaTha
 */

@Entity
public class advogado implements Serializable {
    
@Id
@GeneratedValue
private int codigo;
private String nome;
private String registroOAB;


@ManyToMany
private List<processo> processos;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the registroOAB
     */
    public String getRegistroOAB() {
        return registroOAB;
    }

    /**
     * @param registroOAB the registroOAB to set
     */
    public void setRegistroOAB(String registroOAB) {
        this.registroOAB = registroOAB;
    }

    /**
     * @return the processos
     */
    public List<processo> getProcessos() {
        return processos;
    }

    /**
     * @param processos the processos to set
     */
    public void setProcessos(List<processo> processos) {
        this.processos = processos;
    }



}

