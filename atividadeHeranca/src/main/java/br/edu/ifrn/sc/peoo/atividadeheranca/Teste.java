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

public class Teste {
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica(
                "12.000.458/0001-72", 
                "388.108.598.269", 
                "400289-2",
                "Indústrias Stark",
                "Rua dos Bobos, Nº 0", 
                "4002-8922"
        );
        
//        p.setCPF();
//        p.setCNPJ();
    }
}
