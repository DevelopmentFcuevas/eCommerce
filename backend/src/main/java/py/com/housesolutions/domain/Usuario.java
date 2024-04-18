package py.com.housesolutions.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;
import py.com.housesolutions.model.Tipo;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@ToString
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("Identificador único del registro.")
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    @Comment("Nombre de la persona")
    private String name;
    @Column(name = "username", nullable = true)
    @Comment("Nombre del usuario")
    private String username;
    @Column(name = "password", nullable = true)
    @Comment("Password del usuario")
    private String password;
    @Column(name = "email", nullable = true)
    private String email;
    @Column(name = "direccion", nullable = true)
    @Comment("Direccion de la persona")
    private String direccion;
    @Column(name = "telefono", nullable = true)
    @Comment("Telefono de la persona")
    private String telefono;
    @Column(name = "tipo", nullable = true, columnDefinition = "varchar(255) default 'USER'")
    @Enumerated(EnumType.STRING)
    @Comment("Tipo de usuario.")
    private Tipo tipo;
}
