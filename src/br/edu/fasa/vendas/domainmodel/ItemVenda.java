/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.vendas.domainmodel;

import javax.persistence.*;

/**
 *
 * @author www
 */

@Entity
@Table (name="itensVendas")
public class ItemVenda {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    @Column (name="cod")
    private int cod;
    
    @ManyToOne(cascade= CascadeType.ALL,targetEntity=Venda.class)
    @JoinColumn(name="venda")    
    private Venda venda;
    
    @ManyToOne(cascade= CascadeType.ALL,targetEntity=Produto.class)
    @JoinColumn(name="produto")
    private Produto produto;
    
    @Column (name="qtd")
    private int quantidade;

    @Column(name="valorUnit")    
    private float valorUnitario;

    public void VendaItem() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Produto getProduto() {
        return produto;
    }
    

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
