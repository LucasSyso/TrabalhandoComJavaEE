package com.lucas.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/*
 
 	Classe denomidada de BEAN, que serve para realizar operações
 	que as páginas xhtml necessitam que sejam executadas.
 
 */

@SuppressWarnings("serial")

@Named //É uma anotação que permite que esta classe seja acessível ao arquivo xhtml
//Com ela podemos dar um nome específico acessível no arquivo xhtml.

@RequestScoped //Faz com que este objeto exista somente em escopo de requisição.
public class IndexBean implements Serializable{
	//Enuns também podem ser usados como Outcomes
	public enum Pages{
		index,
		index2;
	}
	
	private String page;
	
	public String getMensagem() {
		return "Esta é uma mensagem vinda do BEAN!!";
	}
	
	//Método que retorna o Outcome de acordo com as opções do usuário
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
