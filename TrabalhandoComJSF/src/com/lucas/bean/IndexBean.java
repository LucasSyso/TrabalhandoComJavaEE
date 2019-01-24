package com.lucas.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
 
 	Classe denomidada de BEAN, que serve para realizar opera��es
 	que as p�ginas xhtml necessitam que sejam executadas.
 
 */

@SuppressWarnings("serial")

@Named //� uma anota��o que permite que esta classe seja acess�vel ao arquivo xhtml
//Com ela podemos dar um nome espec�fico acess�vel no arquivo xhtml.

@RequestScoped //Faz com que este objeto exista somente em escopo de requisi��o.
public class IndexBean implements Serializable{
	//Enuns tamb�m podem ser usados como Outcomes
	public enum Pages{
		index,
		index2;
	}
	
	private String page;
	
	public String getMensagem() {
		return "Esta � uma mensagem vinda do BEAN!!";
	}
	
	//M�todo que retorna o Outcome de acordo com as op��es do usu�rio
	public Pages goTo() {
		if(page.equals("a")) {
			return Pages.index;
		}else {
			return Pages.index2;
		}
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
}
