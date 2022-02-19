package br.edu.ifrn.sc.peoo.atividadeheranca;

import java.util.Date;

public class PessoaFisica extends Pessoa {
    private String CPF;
    private String rg;
    private Date dataNascimento;

    public PessoaFisica(String cpf, String rg, Date dataNascimento, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.CPF = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        
        System.out.println(this.getClass());
    }

    public PessoaFisica() {
        System.out.println(this.getClass());
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
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
