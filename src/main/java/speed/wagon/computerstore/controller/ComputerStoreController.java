package speed.wagon.computerstore.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import speed.wagon.computerstore.model.Console;
import speed.wagon.computerstore.model.Laptop;
import speed.wagon.computerstore.model.PC;
import speed.wagon.computerstore.service.ComputerService;

@Controller
public class ComputerStoreController {
    private final ComputerService computerService;

    public ComputerStoreController(ComputerService computerService) {
        this.computerService = computerService;
    }
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String viewStartPage() {
        return "index";
    }

    @RequestMapping(value = {"/computers"}, method = RequestMethod.GET)
    public String viewAllComputers(Model model) {
        List<PC> pcs = computerService.getAllPcs();
        model.addAttribute("pcs", pcs);
        List<Laptop> laptops = computerService.getAllLaptops();
        model.addAttribute("laptops", laptops);
        List<Console> consoles = computerService.getAllConsoles();
        model.addAttribute("consoles", consoles);
        return "allComputers";
    }
}
