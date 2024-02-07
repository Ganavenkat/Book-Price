package com.blueyonder.Lab4MyBookPriceMS.service;

import com.blueyonder.Lab4MyBookPriceMS.model.BookPrice;

public interface BookPriceService {
    public BookPrice getBookPriceById(Integer bookId);
    public double getOfferedPriceById(Integer bookId);


}
