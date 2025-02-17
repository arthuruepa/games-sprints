package application.model;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistance.Column;
import jakarta.persistance.Entity;
import jakarta.persistance.Id;
import jakarta.persistance.Table;
import jakarta.persistance.GenerationType;
import jakarta.persistance.GeneratedValue;
import jakarta.persistance.OneToMany;



@Entity
@Table(name = "categorias")

public class Categoria{

    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private long id;
    @Column (unique=true, nullable=false)

}