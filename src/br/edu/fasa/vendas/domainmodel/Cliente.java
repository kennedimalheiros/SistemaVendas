/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainmodel;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author www
 */
@Entity
@Table (name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="cod")
    private int cod;
    
    @Column(name="nome", length=100, nullable=false)
    private String nome;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAniversario;
    
    public void Cliente() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtAniversario() {
        return dtAniversario;
    }

    public void setDtAniversario(Date dtAniversario) {
        this.dtAniversario = dtAniversario;
    }
    
    
}
