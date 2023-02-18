package speed.wagon.computerstore.controller;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import speed.wagon.computerstore.model.Console;
import speed.wagon.computerstore.model.Laptop;
import speed.wagon.computerstore.model.PC;
import speed.wagon.computerstore.service.ComputerService;

@Controller
public class ShoppingCartController {
    private final ComputerService computerService;

    public ShoppingCartController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @RequestMapping(value = {"/shoppingCart"}, method = RequestMethod.GET)
    public String viewShoppingCart(Model model) {
        List<PC> pcsInShoppingCart = computerService.getPcsInShoppingCart();
        List<Laptop> laptopsInShoppingCart = computerService.getLaptopsInShoppingCart();
        List<Console> consolesInShoppingCart = computerService.getConsolesInShoppingCart();
        StringBuilder stringBuilder = new StringBuilder();
        pcsInShoppingCart.stream().forEach(ps -> stringBuilder.append(ps).append("; ").append("\n"));
        laptopsInShoppingCart.stream().forEach(lp -> stringBuilder.append(lp).append("; ").append("\n"));
        consolesInShoppingCart.stream().forEach(c -> stringBuilder.append(c).append("; ").append("\n"));
        model.addAttribute("message", stringBuilder.toString());
        return "shopping.cart/shoppingCart";
    }
    @RequestMapping(value = "/add-to-shopping-cart", method = RequestMethod.POST)
    public String addToShoppingCart(@RequestParam String type,
                                    @RequestParam Long id) {
        if (type.equals("pc")) {
            PC pc = computerService.getPCById(id);
            pc.setIsInCart(true);
            computerService.save(pc);
        } else if (type.equals("laptop")) {
            Laptop laptop = computerService.getLapTopById(id);
            laptop.setIsInCart(true);
            computerService.save(laptop);
        } else if (type.equals("console")) {
            Console console = computerService.getConsoleById(id);
            console.setIsInCart(true);
            computerService.save(console);
        }
        return "index";
    }
}
