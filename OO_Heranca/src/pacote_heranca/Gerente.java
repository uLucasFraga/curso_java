//----- 02
package pacote_heranca;

class Gerente extends Funcionario {
private String usuario ;



public double calculaBonificacao () {
return this . getSalario () * 0.6 + 100;
}
public String getUsuario () {
return this .usuario;
}

public void setUsuario (String usuario) {
	 this .usuario = usuario ;
	}
 


}

