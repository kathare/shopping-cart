package product1.product1.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.stream.Location;

@FeignClient(name = "location-service")
public interface LocationServiceProxy {

    @GetMapping(path = "/location", produces = "application/json")
    Location getLocation();
}
