package Spring;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//UsuarioControllerTest.java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:test.properties")
public class UsuarioControllerTest {

@Autowired
private MockMvc mockMvc;

@Test
public void testObterUsuario() throws Exception {
   mockMvc.perform(MockMvcRequestBuilders.get("/v1/usuario")
           .withBasicAuth("usuario", "senha"))
           .andExpect(status().isOk());
}
}
