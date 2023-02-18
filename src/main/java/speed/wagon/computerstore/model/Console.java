package speed.wagon.computerstore.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Console extends Computer {
    private String type;
    private String teraflops;

    @Override
    public String toString() {
        return "Console{"
                + ", id=" + id
                + ", cpu='" + cpu + '\''
                + ", gpu='" + gpu + '\''
                + ", ram='" + ram + '\''
                + ", memory='" + memory + '\''
                + ", teraflops='" + teraflops + '\''
                + ", details='" + details + '\''
                + ", price=" + price
                + '}';
    }
}
