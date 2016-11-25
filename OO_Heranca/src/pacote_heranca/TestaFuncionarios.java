// -----05
package pacote_heranca;

class TestaFuncionarios {
public static void main ( String [] args ) {
Gerente g = new Gerente ();


g.setNome (" Rafael Cosentino ");
g. setSalario (2000) ;
g. setUsuario (" rafael . cosentino ");
g. setSenha (" 12345 ");
g.setMatricula("001");
g.setRg("100.26208-8");
g.setCpf("071.671.797-28");
g.setSexo("M");
g.setTelefone("996789-9089");
g.setCep("25500-256");

Telefonista t = new Telefonista ();
t. setNome (" Carolina Mello ");
t. setSalario (1000) ;
t. setEstacaoDeTrabalho (13) ;
t.setSenha("245A.01");
t.setMatricula("011");
t.setRg("102.25208-9");
t.setCpf("074.675.795-29");
t.setSexo("F");
t.setTelefone("996700-9080");
t.setCep("35503-255");


Secretaria s = new Secretaria ();
s. setNome (" Tatiane Andrade ");
s. setSalario (1500) ;
s. setRamal (198) ;
s.setSenha("246A.02");
s.setMatricula("012");
s.setRg("102.25228-2");
s.setCpf("072.675.295-28");
s.setSexo("F");
s.setTelefone("996705-9580");
s.setCep("35501-233");


 System .out . println ("");
 System .out . println (" GERENTE ");
 System .out . println ("");
 System .out . println (" Nome : " + g. getNome ());
 System .out . println (" Salário : " + g. getSalario ());
 System .out . println (" Usuário : " + g. getUsuario ());
 System .out . println (" Senha : " + g. getSenha ());
 System .out . println (" Bonificação : " + g. calculaBonificacao ());

 System .out . println (" TELEFONISTA ");
 System .out . println (" Nome : " + t. getNome ());
 System .out . println (" Salário : " + t. getSalario ());
 System .out . println (" Estacao de trabalho : " + t. getEstacaoDeTrabalho ());
 System .out . println (" Senha : " + t. getSenha ());
 System .out . println (" Bonificação : " + t. calculaBonificacao ());

 System .out . println (" SECRETARIA ");
 System .out . println (" Nome : " + s. getNome ());
 System .out . println (" Salário : " + s. getSalario ());
 System .out . println (" Ramal : " + s. getRamal ());
 System .out . println (" Senha : " + s. getSenha ());
 System .out . println (" Bonificação : " + s. calculaBonificacao ());
 }
 }