package product1.product1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product1.product1.model.Product;

import javax.xml.stream.Location;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private LocationServiceProxy locationServiceProxy;

    @GetMapping(produces = "application/json")
    public Product getproduct(){
        Location location = locationServiceProxy.getLocation();
        return new Product("remote", 1, location);
    }
}
