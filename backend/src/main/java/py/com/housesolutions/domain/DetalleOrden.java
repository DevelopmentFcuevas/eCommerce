package py.com.housesolutions.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "orden")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("Identificador único del registro.")
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "cantidad")
    @Comment("Cantidad en el detalle")
    private double cantidad;
    @Column(name = "precio")
    @Comment("Precio en el detalle")
    private double precio;
    @Column(name = "total")
    @Comment("Total del detalle")
    private double total;
}
