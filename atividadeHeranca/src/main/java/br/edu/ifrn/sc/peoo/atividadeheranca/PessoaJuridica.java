/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sc.peoo.atividadeheranca;

/**
 *
 * @author 20201114010042
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscrEstadual;
    private String inscrMunicipal;
    
    public PessoaJuridica() {
        System.out.println(this.getClass());
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscrEstadual() {
        return inscrEstadual;
    }

    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

    public String getInscrMunicipal() {
        return inscrMunicipal;
    }

    public void setInscrMunicipal(String inscrMunicipal) {
        this.inscrMunicipal = inscrMunicipal;
    }
    
    
}
