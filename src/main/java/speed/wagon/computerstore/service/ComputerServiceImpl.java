package speed.wagon.computerstore.service;

import java.util.ArrayList;
import java.util.List;
import speed.wagon.computerstore.dao.ComputerRepository;
import speed.wagon.computerstore.model.Computer;
import org.springframework.stereotype.Service;
import speed.wagon.computerstore.model.Console;
import speed.wagon.computerstore.model.Laptop;
import speed.wagon.computerstore.model.PC;

@Service
public class ComputerServiceImpl<C extends Computer> implements ComputerService<C> {
    private final ComputerRepository<C> computerRepository;

    public ComputerServiceImpl(ComputerRepository<C> computerRepository) {
        this.computerRepository = computerRepository;
    }

    public C save(C computer) {
        C savedEntity = computerRepository.save(computer);
        return savedEntity;
    }

    @Override
    public PC getPCById(Long id) {
        return computerRepository.getPCById(id);
    }

    @Override
    public Laptop getLapTopById(Long id) {
        return computerRepository.getLapTopById(id);
    }

    @Override
    public Console getConsoleById(Long id) {
        return computerRepository.getConsoleById(id);
    }

    @Override
    public List<Object> getAll() {
        List<PC> pcs = computerRepository.getAllPCs();
        List<Laptop> laptops = computerRepository.getAllLaptops();
        List<Console> consoles = computerRepository.getAllConsoles();
        List<Object> allTechnic = new ArrayList<>();
        allTechnic.addAll(pcs);
        allTechnic.addAll(laptops);
        allTechnic.addAll(consoles);
        return allTechnic;
    }

    public List<PC> getAllPcs() {
        return computerRepository.getAllPCs();
    }

    @Override
    public List<Console> getConsolesInShoppingCart() {
        return computerRepository.getConsolesInShoppingCart();
    }

    @Override
    public List<Laptop> getLaptopsInShoppingCart() {
        return computerRepository.getLaptopsInShoppingCart();
    }

    @Override
    public List<PC> getPcsInShoppingCart() {
        return computerRepository.getPCsInShoppingCart();
    }

    public List<Laptop> getAllLaptops() {
        return computerRepository.getAllLaptops();
    }

    public List<Console> getAllConsoles() {
        return computerRepository.getAllConsoles();
    }
}
