package br.com.felipe.dslist.dto;

import br.com.felipe.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {

    }
    /*A logica aqui é, o GameMinDTO ele vai instanciar os arquivos da Classe game, jogando pra dentro
    * do GameMinDTO os dados que tao em Games para o DTO.
    * Game seria a class e o nome ''entity'' pode ser qualquer nome... no caso, pode ser
    * entity, dados, banana, caju,
    * SO PRECISA DOS GETTERS EM DTO*/
    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
