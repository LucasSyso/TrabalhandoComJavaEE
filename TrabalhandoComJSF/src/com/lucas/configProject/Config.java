package com.lucas.configProject;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

/*
 
 	Classe de configura��o usada para evitar o erro 
 	Factory 'javax.faces.lifecycle.ClientWindowFactory' was not configured properly.
 	
 	Este objeto ter� escopo de aplica��o, ou seja, 
 	ter� seu ciclo de vida com a dura��o da aplica��o inteira.

 */

@FacesConfig(version = Version.JSF_2_3)//Estabelece a vers�o do JSF da aplica��o.
@ApplicationScoped //Faz parte do CDI que serve para gerenciar o escopo de alguns objetos da aplica��o
public class Config {
}
