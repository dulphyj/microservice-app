package demo.dlph.hotel.controller;

import demo.dlph.hotel.model.Hotel;
import demo.dlph.hotel.service.ServiceHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HotelController {
    @Autowired
    ServiceHotel serviceHotel;

    @GetMapping(value = "hotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Hotel> getAllHotels() {
        return serviceHotel.getAllHotels();
    }
}
