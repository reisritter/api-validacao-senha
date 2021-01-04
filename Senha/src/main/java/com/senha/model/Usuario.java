package com.senha.model;

import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Usuario {

	private String usuarioSenha;
	
	
}
