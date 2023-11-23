package br.com.felipe.dslist.repositories;

import br.com.felipe.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
//Aqui vai o comando que vai pegar os dados do banco de dados. Tem que ser uma interface pois é um "CONTRATO"!
//Extende-se a interface com o JPARepository e no primeiro campo, coloca o lugar que ele vai pegar os dados e o tipo
//Lembrando que aqui ele vai DELETAR, CRIAR, ATUALIZAR o banco de dados