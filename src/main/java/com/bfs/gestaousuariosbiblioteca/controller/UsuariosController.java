package com.bfs.gestaousuariosbiblioteca.controller;

import com.bfs.gestaousuariosbiblioteca.model.Usuario;
import com.bfs.gestaousuariosbiblioteca.repository.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuariosController {

    @Autowired
    private Usuarios usuarios;

    @GetMapping("/usuarios")
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaUsuarios");
        modelAndView.addObject("usuarios", usuarios.findAll());

        return modelAndView;
    }

}
