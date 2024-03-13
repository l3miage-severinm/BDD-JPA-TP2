package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table
public class Projet {

    @Id
    Integer id;

    String name;

    String description;

    @ManyToMany(mappedBy = "projets")
    Set<DeveloperMiage> developers;
}
