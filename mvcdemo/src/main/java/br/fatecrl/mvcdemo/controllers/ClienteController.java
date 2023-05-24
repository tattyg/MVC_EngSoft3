package br.fatecrl.mvcdemo.controllers;

import br.fatecrl.mvcdemo.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    public List<Cliente> clientes = new ArrayList<Cliente>();

    public ClienteController(){
        clientes.add(new Cliente("Globo","12345689009",690));
        clientes.add(new Cliente("SBT","6543210908",700));
        clientes.add(new Cliente("Band","456789090987",860));
        clientes.add(new Cliente("Record","789090987456",999));
    }
    @GetMapping
    public String getClientes(Model model){
    model.addAttribute("clientes",clientes);
    return "clientes";
    }

}
