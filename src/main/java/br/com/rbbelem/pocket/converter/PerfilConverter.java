package br.com.rbbelem.pocket.converter;

import java.beans.PropertyEditorSupport;

import br.com.rbbelem.pocket.entity.Perfil;

public class PerfilConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		Perfil perfil = Perfil.ADMIN;
		
		if (text.equalsIgnoreCase("USER")) {
			perfil = Perfil.USER;
		}
		
		super.setValue(perfil);
	}	
}
