package br.com.nutriCenter.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Login {

	@NotBlank(message = "Informe o email")
    private final String userName;
	
	@NotBlank(message = "Informe a senha")
    private final String password;
	
	@NotNull(message = "Informe o acesso")
    private final int nivelDeAcesso;


    public Login(String userName, String password, int nivelDeAcesso) {
		this.userName = userName;
		this.password = password;
		this.nivelDeAcesso = nivelDeAcesso;
	}

    
	public int getNivelDeAcesso() {
		return nivelDeAcesso;
	}

	public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

