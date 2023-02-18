package speed.wagon.computerstore.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import speed.wagon.computerstore.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import speed.wagon.computerstore.model.Console;
import speed.wagon.computerstore.model.Laptop;
import speed.wagon.computerstore.model.PC;

@Repository
public interface ComputerRepository<C extends Computer> extends JpaRepository<C, Long> {
    @Query("from PC where id =?1")
    PC getPCById(Long id);

    @Query("from Laptop where id =?1")
    Laptop getLapTopById(Long id);

    @Query("from Console where id =?1")
    Console getConsoleById(Long id);

    @Query("from PC ")
    List<PC> getAllPCs();

    @Query("from Laptop ")
    List<Laptop> getAllLaptops();

    @Query("from Console")
    List<Console> getAllConsoles();

    @Query("from PC where isInCart = true ")
    List<PC> getPCsInShoppingCart();

    @Query("from Laptop where isInCart = true ")
    List<Laptop> getLaptopsInShoppingCart();

    @Query("from Console where isInCart = true ")
    List<Console> getConsolesInShoppingCart();
}
