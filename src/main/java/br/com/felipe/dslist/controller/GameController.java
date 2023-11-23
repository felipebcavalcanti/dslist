package br.com.felipe.dslist.controller;

import br.com.felipe.dslist.dto.GameMinDTO;
import br.com.felipe.dslist.entities.Game;
import br.com.felipe.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//o controlador é o que expoe o back end para o front, ele é a ''API''
@RestController
@RequestMapping(value = "/games")
public class GameController {
    //o controler injeta o Service, que por sua vez, o service injeta o repository;
    @Autowired
    private GameService gameService;
    //com eu quero pegar la de dentro os valores entao eu chamo o GET.
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<Game> result = gameService.findAll();
        List<GameMinDTO> dto;
        dto = result.stream().map(p -> new GameMinDTO(p)).toList();
        return dto;

    }
}
