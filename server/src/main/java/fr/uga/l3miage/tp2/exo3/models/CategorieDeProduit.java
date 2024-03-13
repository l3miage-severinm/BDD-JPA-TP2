package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

/*
 * Une catégorie répertorie au moins un produit
 *      -> produits contient au moins un Produit
 */
@Entity
public class CategorieDeProduit extends NamedEntity {
    @ManyToMany(mappedBy = "categories")
    Set<Produit> produits;
}
