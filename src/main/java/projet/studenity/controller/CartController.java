package projet.studenity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projet.studenity.model.Cart;
import projet.studenity.model.Product;
import projet.studenity.service.CartService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping(value="/delete")
    public boolean deleteFromCart(@RequestBody Cart cart){
        return cartService.deleteFromCart(cart);
    }

    @PostMapping(value="/create")
    public boolean addToCart(@RequestBody int idUser, int idProduct){
        Cart cart = new Cart();
        cart.setIdUser(idUser);
        cart.setIdProduct(idProduct);
        return cartService.addToCart(cart);
    }

    @PostMapping(value="/pay")
    public boolean payCart(@RequestBody int idUser){
        return cartService.payCart(idUser);
    }

    @PostMapping(value="/deleteAll")
    public boolean deleteAll(@RequestBody int idUser){return cartService.deleteAllFromCart(idUser);}

    @PostMapping(value="/totalPrice")
    public Double totalPrice(@RequestBody int idUser){
        return cartService.totalPrice(idUser);
    }

    @PostMapping(value="/list")
    public List<Product> listProduct(@RequestBody int idUser){
        return cartService.listProduct(idUser);
    }

    @GetMapping(value="/test")
    public boolean test() {
        Cart cart = new Cart();
        cart.setIdUser(7);
        cart.setIdProduct(220);
        return cartService.addToCart(cart);
    }
}