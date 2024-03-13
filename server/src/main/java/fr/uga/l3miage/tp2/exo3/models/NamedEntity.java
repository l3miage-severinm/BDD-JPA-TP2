package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class NamedEntity extends MyEntity {
    String nom;
}
