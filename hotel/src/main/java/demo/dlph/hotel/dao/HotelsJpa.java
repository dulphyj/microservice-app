package demo.dlph.hotel.dao;

import demo.dlph.hotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelsJpa extends JpaRepository<Hotel, Integer> {
}
