package br.com.nutriCenter.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.nutriCenter.model.Administrador;
import br.com.nutriCenter.model.Login;
import br.com.nutriCenter.repository.AdministradorRepository;
import br.com.nutriCenter.services.AdministradorService;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.allow-bean-definition-overriding=true")
public class LoginServiceTeste {
	
	
	AdministradorService administradorService;
	
	
	AdministradorRepository administradorRepository;
	
	
	Administrador admin;

	@BeforeEach
	public void setUp() throws Exception {

		admin = new Administrador();
		admin.setCargaHoraria(1);
		admin.setCell(null);
		admin.setDataNasc(null);
		admin.setEmail("maria@email.com");
		admin.setGenero("Feminino");
		admin.setId(1L);
		admin.setNivelDeAcesso(3);
		admin.setNome("Maria");
		admin.setSobreNome("Alves");
		admin.setSenha("12345678");

		administradorService.create(admin);
	}
	@Test
	public void fazerLogin() {
		
		Login login = new Login(admin.getEmail(), admin.getSenha(),2);
	}

	
	
	
	
	
	
	
}
