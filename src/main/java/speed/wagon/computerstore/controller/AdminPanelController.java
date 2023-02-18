package speed.wagon.computerstore.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import speed.wagon.computerstore.model.Console;
import speed.wagon.computerstore.model.Laptop;
import speed.wagon.computerstore.model.PC;
import speed.wagon.computerstore.service.ComputerService;

@RestController
@RequestMapping("/admin/add")
public class AdminPanelController {
    private final ComputerService computerService;

    public AdminPanelController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @PostMapping("/pc")
    public PC saveComputer(@RequestBody PC computer) {
        return (PC) computerService.save(computer);
    }

    @PostMapping("/console")
    public Console saveComputer(@RequestBody Console console) {
        return (Console) computerService.save(console);
    }

    @PostMapping("/laptop")
    public Laptop saveComputer(@RequestBody Laptop laptop) {
        return (Laptop) computerService.save(laptop);
    }

    @GetMapping()
    public List getAll() {
        return computerService.getAll();
    }
}
