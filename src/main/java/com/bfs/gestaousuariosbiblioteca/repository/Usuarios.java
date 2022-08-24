package com.bfs.gestaousuariosbiblioteca.repository;

import com.bfs.gestaousuariosbiblioteca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Usuarios extends JpaRepository<Usuario, Long> {
}
