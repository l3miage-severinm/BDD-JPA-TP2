package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class Client extends NamedEntity {
    String nom;
    String email;
    @OneToOne
    Adresse adresse;
    @OneToMany(mappedBy = "client")
    Set<Commande> commandes;
}
