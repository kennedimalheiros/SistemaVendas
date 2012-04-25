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
@Table (name="produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="cod")
    private int cod;
    
    @Column (name="nome", length=100, nullable=false)
    private String nome;
    @Column (name="valor", nullable=false)
    private float valor;
    @Column (name="estoque", nullable=false)
    private int estoque;

    public void Produto() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
