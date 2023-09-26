package watch.hydro.api.entities.usuario;

import watch.hydro.api.entities.usuario.DadosEndereco;

public record DadosCadastroUsuario(String nome, String email, String cpf, String contato, TipoUsuario tipoUsuario) {

}
