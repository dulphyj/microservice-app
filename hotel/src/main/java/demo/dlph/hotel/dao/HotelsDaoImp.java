package demo.dlph.hotel.dao;

import demo.dlph.hotel.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HotelsDaoImp implements HotelsDao{
    @Autowired
    HotelsJpa hotelsJpa;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelsJpa.findAll();
    }
}
