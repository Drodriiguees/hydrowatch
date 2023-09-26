package watch.hydro.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import watch.hydro.api.entities.usuario.DadosCadastroUsuario;

@RestController
@RequestMapping("usuario")
public class usuarioController {

  @PostMapping
  public void cadastrar(@RequestBody DadosCadastroUsuario dados) {
    System.out.println(dados);
  }
}
