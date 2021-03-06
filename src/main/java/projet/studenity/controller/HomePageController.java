package projet.studenity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projet.studenity.dao.ProductDao;
import projet.studenity.model.Product;
import projet.studenity.service.ProductService;
import projet.studenity.service.HomePageService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomePageController {
    @Autowired
    ProductService productService;
    @Autowired
    ProductDao productDao;
    @Autowired
    HomePageService homePageService;

 /*   @GetMapping(value="/{name}")
    public List<Product> findProductByName(@PathVariable("name") String name){
        return productService.findProductByName(name);
    }*/

    @GetMapping(value="/homepage") //test
    public List<Product> getProduct(){
        return productDao.getAll();
    }

    @PostMapping(value="/")
    public List<Product> findProductByName(@RequestBody String name){   //Front va envoyer un String de moteur de recherche a Back
        return productService.findProductByName(name);  //Back renvoie une liste Product qui approprie.
    }

}
