package ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;


import dominio.Contato;
import dominio.Fornecedor;
import dominio.Funcionario;

@Stateful
public class DadosSistema {
	
	
	public DadosSistema() {
		super();
	}
	public DadosSistema(String telaAnterior, Funcionario usuarioLogado, Fornecedor forneceDorUtilizado) {
		super();
		this.telaAnterior = telaAnterior;
		this.usuarioLogado = usuarioLogado;
		this.forneceDorUtilizado = forneceDorUtilizado;
	}
	String telaAnterior;
	Funcionario usuarioLogado;
	Fornecedor forneceDorUtilizado;
	
	public String getTelaAnterior() {
		return telaAnterior;
	}
	public void setTelaAnterior(String telaAnterior) {
		this.telaAnterior = telaAnterior;
	}
	public Funcionario getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(Funcionario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public Fornecedor getForneceDorUtilizado() {
		return forneceDorUtilizado;
	}
	public void setForneceDorUtilizado(Fornecedor forneceDorUtilizado) {
		this.forneceDorUtilizado = forneceDorUtilizado;
	}

	
}
