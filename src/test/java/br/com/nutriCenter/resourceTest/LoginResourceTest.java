package br.com.nutriCenter.resourceTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceSchemaCreatedEvent;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.nutriCenter.model.Login;
import br.com.nutriCenter.model.Usuario;
import br.com.nutriCenter.resource.LoginResource;
import br.com.nutriCenter.services.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class LoginResourceTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private LoginResource loginController;

	@MockBean
	private LoginService loginService;

	private Login login;

	private final String urlBase = "/api";

	private ObjectMapper objectMapper;

	@BeforeEach
	public void setUp() throws Exception {
		objectMapper = new ObjectMapper();

		Usuario user = new Usuario();
		user.setNome("Mateus");
		user.setSobreNome("Fernandes");
		user.setSenha("12345678");
		user.setEmail("mateus@email.com");
		Mockito.when(loginService.logarUsuario(login)).thenReturn(user);

		login = gerarLogin(user.getEmail(), user.getSenha(), 2);
	}

	@Test
	public void deveRetornarSucessoAoLogarTeste() throws Exception {
		mockMvc.perform(post(urlBase + "/login").content(objectMapper.writeValueAsString(login))
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)).andExpect(status().isOk());

		// MvcResult result = mockMvc
		// .perform(MockMvcRequestBuilders.post(urlBase +
		// "/login").content(objectMapper.writeValueAsString(login))
		// .contentType(MediaType.APPLICATION_JSON))
		// .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		// String resposta = result.getResponse().getContentAsString();

	}

	@Test
	public void deveRetornarErroAoTentarLogarSemUser() throws Exception {
		Login log1 = new Login("", "12345678", 2);

		mockMvc.perform(post(urlBase + "/login").content(objectMapper.writeValueAsString(log1))
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest());

	}

	@Test
	public void deveRetornarErroAoTentarLogarSemPass() throws Exception {
		Login log1 = new Login("mateus@email.com", "", 2);

		mockMvc.perform(post(urlBase + "/login").content(objectMapper.writeValueAsString(log1))
				.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest());

	}

	public Login gerarLogin(String user, String pass, int acesso) {

		Login login = new Login(user, pass, acesso);

		return login;

	}

}
