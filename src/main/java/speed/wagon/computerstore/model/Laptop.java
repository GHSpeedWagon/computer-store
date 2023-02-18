package speed.wagon.computerstore.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Laptop extends Computer {
    private String type;
    private String motherBoard;
    private String monitor;
    private String batterySize;

    @Override
    public String toString() {
        return "Laptop{"
                + ", id=" + id
                + ", cpu='" + cpu + '\''
                + ", gpu='" + gpu + '\''
                + ", ram='" + ram + '\''
                + ", memory='" + memory + '\''
                + "type='" + type + '\''
                + ", motherBoard='" + motherBoard + '\''
                + ", monitor='" + monitor + '\''
                + ", batterySize='" + batterySize + '\''
                + ", details='" + details + '\''
                + ", price=" + price
                + '}';
    }
}
