// ---- 01
package pacote_heranca;

class Funcionario {
private double salario ;
private String nome ;
private String matricula;
private String rg;
private String cpf;
private String sexo;
private String senha;
private String telefone;
private String cep;

public double calculaBonificacao () {
return this . salario * 0.1;
}

public double getSalario () {
return this . salario ;
}

 public String getNome () {
return this . nome ;
 }
 
 public String getMatricula () {
	 return this .matricula ;
	  }

 public String getRg () {
	 return this .rg ;
	  }
 
 public String getSexo () {
	 return this .sexo ;
	  }
 
 public String getCpf () {
	 return this .cpf ;
	  }
 
 
 public String getSenha () {
	 return this .senha ;
	  }
 
 public String getTelefone () {
	 return this .telefone ;
	  }
 
 public String getCep () {
	 return this .cep ;
	  }
 
public void setSalario ( double salario ) {
 this . salario = salario ;
}

 public void setMatricula ( String matricula ) {
 this . matricula = matricula ;
}
 
 public void setRg ( String rg ) {
 this . rg = rg ;
}
 
 public void setCpf ( String cpf ) {
 this . cpf = cpf ;
} 
 
 
 public void setNome ( String nome ) {
 this . nome = nome ;
}
 
 public void setSexo ( String sexo ) {
	 this . sexo = sexo ;
	} 
 
 public void setSenha ( String senha ) {
	 this . senha = senha ;
	}
 
 public void setTelefone (String telefone ) {
	 this . telefone = telefone ;
	}
 
 public void setCep (String cep ) {
	 this . cep = cep ;
	}
 }