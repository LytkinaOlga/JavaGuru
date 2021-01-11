package by.bntu.fitr.poisit.lytkina;

import by.bntu.fitr.poisit.lytkina.bean.Product;
import by.bntu.fitr.poisit.lytkina.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private ProductRepository productRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewProduct (@RequestParam String name,
                                               @RequestParam double price,
                                               @RequestParam double discount,
                                               @RequestParam ProductCategory category,
                                               @RequestParam String description) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDiscount(discount);
        product.setCategory(category);
        product.setDescription(description);
        productRepository.save(product);
        return "Saved";
    }

//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<Product> getAllProducts() {
//        // This returns a JSON or XML with the users
//        return productRepository.findAll();
//    }
    @GetMapping(path="/all")
    public String getAllProducts(@RequestParam String name,
                                 @RequestParam double price,
                                 @RequestParam double discount,
                                 @RequestParam ProductCategory category,
                                 @RequestParam String description,
                                 Model model) {
        model.addAttribute("name", name);
        model.addAttribute("price", price);
        model.addAttribute("discount", discount);
        model.addAttribute("category", category);
        model.addAttribute("description", description);
        return "index";
    }
}
