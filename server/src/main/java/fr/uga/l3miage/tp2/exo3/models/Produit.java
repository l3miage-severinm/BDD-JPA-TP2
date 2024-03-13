package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

/*
 * Un produit est rangé dans au moins une catégorie
 *      -> categories contient au moins une CategorieDeProduit
 */
@Entity
public class Produit extends NamedEntity {
    double prix;
    int quantite;
    @ManyToOne
    Commande commande;
    @ManyToMany
    Set<CategorieDeProduit> categories;
}
