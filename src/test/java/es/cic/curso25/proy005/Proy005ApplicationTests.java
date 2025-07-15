package es.cic.curso25.proy005;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Proy005ApplicationTests {

	@Autowired
	private MockMvc mockMvc;


	@Test
	void testTelefonoDelete() throws Exception {
	
		mockMvc
		.perform(delete("/telefono/4"))  // se puede añadir .content
		.andDo(print())
		.andExpect(status().isOk())
		.andReturn();

	}

	@Test
	void testLista() {

		ArrayList miLista = new ArrayList();
		miLista.add("Hola");

		String contenido = (String) miLista.get(0);


		List<String> miSegundaLista = new ArrayList<>();
		miSegundaLista.add("Mi mensaje");

		String mensajeOriginal = miSegundaLista.get(0);	
	}
}
