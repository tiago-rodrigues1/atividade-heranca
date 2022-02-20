/*
* Explicação do passo 6:
* Ao digitarmos p.setCPF(); e p.setCNPJ(); obtemos erro, pois estes métodos não
* pertencem à classe pessoa. Mas sim à PessoFisica e PessoaJuridica, respectiva-
* mente.
*
* Explicação do passo 7:
* Ambas as classes imprimiram seus respectivos nomes, duas vezes.
*/

package br.edu.ifrn.sc.peoo.atividadeheranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {
    
    private static Date getDataFormatada(String data) {
        Date dataFormatada = new Date();
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataFormatada = sdf.parse(data);
        } catch (ParseException e) {
            System.err.println(e);
        }
        
        return dataFormatada;
    }
    
    public static void main(String[] args) {
//      Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica(
                "12.000.458/0001-72", 
                "388.108.598.269", 
                "4002-8922",
                "Indústrias Stark",
                "Rua dos Bobos, Nº 0", 
                "4002-8922"
        );
        
        pf.setNome("Tiago Rodrigues");
        pf.setEndereco("Rua das laranjeira, Nº 123");
        pf.setTelefone("98877-6655");
        pf.setCPF("123.456.789-00");
        pf.setRg("123.456.789");
        pf.setDataNascimento(getDataFormatada("28/06/2004"));
    }
}
