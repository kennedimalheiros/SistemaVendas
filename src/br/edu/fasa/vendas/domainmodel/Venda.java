/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainmodel;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author www
 */
@Entity
@Table (name="vendas")
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "cod")
    private int cod;
    
    @Temporal (TemporalType.TIMESTAMP)
    private Date datas;    

    @ManyToOne (cascade= CascadeType.PERSIST)
    @JoinColumn (name="cliente", nullable=false)
    private Cliente cliente;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "venda", targetEntity = ItemVenda.class)
    private List<ItemVenda> itens;

    public void Vendas() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getData() {
        return datas;
    }

    public void setData(Date data) {
        this.datas = data;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
}
