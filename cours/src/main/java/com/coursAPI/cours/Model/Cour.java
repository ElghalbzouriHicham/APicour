package com.coursAPI.cours.Model;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@EntityScan
@Document
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cour {
    @Id
    private String id;
    private String typeCour;
    private String nomCour;
    private String CategorieCour;
    private String prixCour;
    private String descriptionCour;

    private Evaluation evaluation;
    private List<String> ListIdEtudiants;
    private String idEnseignant;


}
