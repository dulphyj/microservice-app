package demo.dlph.hotel.service;

import demo.dlph.hotel.dao.HotelsDao;
import demo.dlph.hotel.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceHotelImp implements ServiceHotel{
    @Autowired
    HotelsDao hotelsDao;

    @Override
    public List<Hotel> getAllHotels() {
        List<Hotel> hotels = hotelsDao.getAllHotels();
        return hotels.stream().filter(t -> t.getAvailable() == 1).collect(Collectors.toList());
    }
}
