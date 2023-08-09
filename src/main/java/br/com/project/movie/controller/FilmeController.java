package br.com.project.movie.controller;
import br.com.project.movie.model.DadosCadastroFilme;
import br.com.project.movie.model.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private List<Filme> listaDeFilmes = new ArrayList<>();
    @GetMapping
    public String carregaPaginaFormulario(){
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados){

        var filmeNovo = new Filme(dados);
        listaDeFilmes.add(filmeNovo);

        System.out.println(listaDeFilmes);
        return "filmes/formulario";
    }
}
