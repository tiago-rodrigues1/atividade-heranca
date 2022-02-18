/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sc.peoo.atividadeheranca;

import java.util.Date;

/**
 *
 * @author 20201114010042
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;
    private Date dataNascimento;

    public PessoaFisica() {
        System.out.println(this.getClass());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
