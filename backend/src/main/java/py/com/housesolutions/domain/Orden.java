package py.com.housesolutions.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Table(name = "orden")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("Identificador único del registro.")
    private Long id;
    @Column(name = "numero", nullable = false)
    @Comment("Numero de orden")
    private String numero;
    @Column(name = "fecha_recibida")
    @Comment("Fecha que se recibió la orden")
    private Date fechaRecibida;
    @Column(name = "fecha_creation")
    @Comment("Registro de la fecha y hora en que se creó el registro.")
    private Date fechaCreation;
    @Column(name = "total")
    @Comment("Total de la orden")
    private double total;
}
