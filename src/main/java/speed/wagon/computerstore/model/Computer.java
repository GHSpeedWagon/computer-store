package speed.wagon.computerstore.model;

import java.math.BigDecimal;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String cpu;
    public String gpu;
    public String ram;
    public String memory;
    public BigDecimal price;
    public String details;
    public Boolean isInCart;

    @Override
    public String toString() {
        return "Computer{"
                + "id=" + id
                + ", cpu='" + cpu + '\''
                + ", gpu='" + gpu + '\''
                + ", ram='" + ram + '\''
                + ", memory='" + memory + '\''
                + ", price=" + price
                + ", details='" + details + '\''
                + ", isInCart=" + isInCart
                + '}';
    }
}
