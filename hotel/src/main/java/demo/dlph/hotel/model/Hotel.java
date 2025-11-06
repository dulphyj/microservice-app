package demo.dlph.hotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
public class Hotel implements Serializable {
    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idHotel;
    private int category;
    private byte available;
    private String name;
    private double price;
}
