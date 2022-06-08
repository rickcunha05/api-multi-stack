package br.com.treinaweb.adoteumpet.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity //Representação que essa classe é de um banco de dados
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
 //Por boa pratica eu tenho que informar pro hash code que ele deve utilizar apenas o ID como parametro
public class Pet {
        
    
    @Id //primare key
    @EqualsAndHashCode.Include //Aqui eu deixo de forma explicita que é esse parametro que eu quero passar pro hash code
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera automaticamente o id 
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String history;

    @Column(nullable = false)
    private String photo;

}