package com.senha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.senha.model.Usuario;
import com.senha.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/validaSenha")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public boolean validarSenha(@RequestBody Usuario usuario) 
	{
		return usuarioService.validarSenha(usuario);
	}

}
