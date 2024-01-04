package Spring;

//SeuController.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

@GetMapping("/v1/usuario")
public String getUsuario() {
   // Implementação do método
   return "Usuário obtido com sucesso";
}
}
