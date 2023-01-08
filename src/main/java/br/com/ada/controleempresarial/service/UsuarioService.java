package br.com.ada.controleempresarial.service;

import br.com.ada.controleempresarial.model.Usuario;
import org.springframework.stereotype.Service;
import br.com.ada.controleempresarial.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        // Implementa regras de validações, etc...
        return usuarioRepository.save(usuario);
    }
}
