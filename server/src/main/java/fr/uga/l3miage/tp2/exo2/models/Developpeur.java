package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("D")
public class Developpeur extends Employe {
    String langagePrefere;
    String niveauCompetence;
}
