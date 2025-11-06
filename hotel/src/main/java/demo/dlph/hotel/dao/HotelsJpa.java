package demo.dlph.hotel.dao;

import demo.dlph.hotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelsJpa extends JpaRepository<Hotel, Integer> {
}
