package com.blueyonder.Lab4MyBookPriceMS.repository;

import com.blueyonder.Lab4MyBookPriceMS.model.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPriceDAO extends JpaRepository<BookPrice,Integer> {
}
