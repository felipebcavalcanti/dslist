package br.com.felipe.dslist.service;

import br.com.felipe.dslist.dto.GameMinDTO;
import br.com.felipe.dslist.entities.Game;
import br.com.felipe.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Aqui vai a regra do negócio.
@Service
public class GameService {
    //Aqui vai injetar o GameRepository aqui dentro, ta puxando o GameService aqui dentro,
    // tem que instanciar pela anotation @Autowired.
    @Autowired
    private GameRepository gameRepository;
    /*Como eu vou devolver para a API uma Lista, entao eu preciso fazer List,
    * com isso a lista tem que ser com os itens que eu quero, que no caso ta ''tipado''
    * dentro do GameMinDTO.
    */
    public List<Game> findAll() {
    //chamar no banco de dados o que eu quero
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
