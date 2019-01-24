package com.lucas.configProject;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

/*
 
 	Classe de configuração usada para evitar o erro 
 	Factory 'javax.faces.lifecycle.ClientWindowFactory' was not configured properly.
 	
 	Este objeto terá escopo de aplicação, ou seja, 
 	terá seu ciclo de vida com a duração da aplicação inteira.

 */

@FacesConfig(version = Version.JSF_2_3)//Estabelece a versão do JSF da aplicação.
@ApplicationScoped //Faz parte do CDI que serve para gerenciar o escopo de alguns objetos da aplicação
public class Config {
}
