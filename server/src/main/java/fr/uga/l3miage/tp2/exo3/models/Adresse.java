package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;

@Entity
public class Adresse extends MyEntity {
    String rue;
    String numero;
    String codePostal;
    String ville;
}
