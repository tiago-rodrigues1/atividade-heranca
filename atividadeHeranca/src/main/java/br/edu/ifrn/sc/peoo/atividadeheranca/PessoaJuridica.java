package br.edu.ifrn.sc.peoo.atividadeheranca;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String inscrEstadual;
    private String inscrMunicipal;

    public PessoaJuridica(String cnpj, String inscrEstadual, String inscrMunicipal, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.CNPJ = cnpj;
        this.inscrEstadual = inscrEstadual;
        this.inscrMunicipal = inscrMunicipal;
        
        System.out.println(this.getClass());
    }
    
    public PessoaJuridica() {
        System.out.println(this.getClass());
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cnpj) {
        this.CNPJ = cnpj;
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
