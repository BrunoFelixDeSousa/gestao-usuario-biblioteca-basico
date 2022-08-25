package com.bfs.gestaousuariosbiblioteca.controller;

import com.bfs.gestaousuariosbiblioteca.model.Usuario;
import com.bfs.gestaousuariosbiblioteca.repository.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private Usuarios usuarios;

    @GetMapping
    public ModelAndView listar() {
        ModelAndView modelAndView = new ModelAndView("ListaUsuarios");
        modelAndView.addObject("usuarios", usuarios.findAll());

        modelAndView.addObject(new Usuario());

        return modelAndView;
    }

    @PostMapping
    public String salvar(Usuario usuario) {
        this.usuarios.save(usuario);
        return "redirect:/usuarios";
    }

}
