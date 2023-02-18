package speed.wagon.computerstore.service;

import java.util.List;
import speed.wagon.computerstore.model.Computer;
import speed.wagon.computerstore.model.Console;
import speed.wagon.computerstore.model.Laptop;
import speed.wagon.computerstore.model.PC;

public interface ComputerService<C extends Computer> {
    C save(C computer);

    PC getPCById(Long id);

    Laptop getLapTopById(Long id);

    Console getConsoleById(Long id);

    List<Object> getAll();

    List<Console> getAllConsoles();

    List<Laptop> getAllLaptops();

    List<PC> getAllPcs();


    List<Console> getConsolesInShoppingCart();

    List<Laptop> getLaptopsInShoppingCart();

    List<PC> getPcsInShoppingCart();

}
