package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class MyEntity {
    @Id
    Long id;
}
