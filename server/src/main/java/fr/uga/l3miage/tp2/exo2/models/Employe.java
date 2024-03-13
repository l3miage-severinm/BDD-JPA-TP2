package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Id;

/*
 * La stratégie d'implémentation de l'héritage choisie est
 * celle de la table unique car il y a peu de caractéristiques
 * qui différencient les Managers des Developpeurs.
 * L'avantage principal est la simplicité de la structure de données
 * stockée en base.
 * L'inconvénient principal est la redondance des données.
 * Cependant cette redondance est minime car il n'y a que 3 champs
 * spécifiques. De plus ces 3 champs sont des chaînes de caractère courtes
 * donc la place occupée en mémoire ne devrait pas poser de problème.
 * Cet inconvénient peut être éliminé en choisissant la stratégie de la
 * table de jointure, au prix d'une structure légèrement plus complexe (2 tables).
 * Pour résumer, j'ai choisi la simplicité plutôt que l'optimisation.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
public abstract class Employe {
    @Id
    Long Id;
    String nom;
    String email;
    double salaire;
}
