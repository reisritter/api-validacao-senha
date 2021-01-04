package com.senha.service;

import org.springframework.stereotype.Service;

import com.senha.model.Usuario;

@Service
public class UsuarioService {

	
	public boolean validarSenha(Usuario usuario) 
	{
		if(usuario.getUsuarioSenha()==null)
			return false;
					
		String senha = usuario.getUsuarioSenha().replaceAll("\\s", "");	
		// Verifica se a senha não é vazia e se tem 9 ou mais caracteres
		boolean resp = !senha.isBlank() && senha.length() >= 9;
		// Transforma a string em um vetor de char
		char[] vetorSenha = senha.toCharArray();
		//Vetor para verificação
		boolean[] contador = {false,false,false,false};
		
		//Verifica se tem mais de 9 caracteres ou se está vazio
		if(resp) 
		{
			// Etapa de verificação de caracteres repetidos
			for(int i=0;i<vetorSenha.length-1;i++)
				for(int j=i+1;j<vetorSenha.length;j++) 				
					if((int)vetorSenha[i]==(int)vetorSenha[j])
						return false;													
			
			// Etapa de verificação do numero mínimo de carcteres
			for(char a : vetorSenha) 
			{
				// Verifica se possui números
				if((int)a >= 48 && (int)a <= 57)
					contador[0]=true;
				// Verifica se possui letras Maiúsculas
				else if((int)a >= 65 && (int)a <= 90)
					contador[1]=true;
				// Verifica se possui letras Minúsculas
				else if((int)a >= 97 && (int)a <= 122)
					contador[2]=true;
				// Verifica se possui os seguintes caracteres especiais
				// !=33 #=35 $=36 %=37 &=38 (=40 )=41 *=42 +=43 -=45 @=64 ^=94      
				else if(((int)a>=35 && (int)a<=38) || ((int)a >= 40 && (int)a <= 43) || (int)a==33 || (int)a==45 || (int)a==64 || (int)a==94)
					contador[3]=true;							
			}
			
			// Caso passe em todas as verificações, retorna true
			if(contador[0] && contador[1] && contador[2] && contador[3])
				return true;
		}
		return false;			
		
	}
	
}
