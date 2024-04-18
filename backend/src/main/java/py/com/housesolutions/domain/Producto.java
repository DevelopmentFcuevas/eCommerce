package py.com.housesolutions.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "productos")
@Getter
@Setter
@ToString
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("Identificador único del registro.")
    private Long id;
    @Column(name = "name", nullable = false)
    @Comment("Nombre del producto")
    private String name;
    @Column(name = "descripcion", nullable = true)
    @Comment("Descripcion del Producto")
    private String descripcion;
    @Column(name = "foto_producto", nullable = true)
    @Comment("Imagen o foto asociada al Producto, string con la URL o PATH donde esta almacenada la imagen.")
    private String fotoProducto;
    @Column(name = "precio")
    @Comment("Precio del producto")
    private double precio;
    @Column(name = "cantidad")
    @Comment("Cantidad del producto")
    private double cantidad;
}
