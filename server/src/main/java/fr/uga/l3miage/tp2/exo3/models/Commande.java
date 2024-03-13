package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

/*
 * produits doit contenir au moins 1 produit
 */
@Entity
public class Commande extends MyEntity {
    Date date;
    double montantTotal;
    @ManyToOne
    Client client;
    @OneToMany(mappedBy = "commande")
    Set<Produit> produits;
}
