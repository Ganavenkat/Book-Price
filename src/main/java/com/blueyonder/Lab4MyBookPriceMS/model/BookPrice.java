package com.blueyonder.Lab4MyBookPriceMS.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "mybookprice", schema = "mybookprice")
@Table(name = "mybookprice")
public class BookPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookId_generator")
    @SequenceGenerator(name = "bookId_generator", sequenceName = "mybookId_gen", initialValue = 110, allocationSize = 1)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "price")
    private double price;

    @Column(name = "offer")
    private double offer;
}
