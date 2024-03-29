package com.blueyonder.Lab4MyBookPriceMS.controller;

import com.blueyonder.Lab4MyBookPriceMS.model.BookPrice;
import com.blueyonder.Lab4MyBookPriceMS.service.BookPriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin // CORS
@RestController
public class BookPriceController {
    static Logger log = LoggerFactory.getLogger(BookPriceController.class);
    @Autowired
    BookPriceService bookPriceService;
    @GetMapping("/bookPrice/{bookId}")
    public BookPrice getBookPrice(@PathVariable Integer bookId) {
        log.info("---BookPriceController---getBookPrice()-----");
        BookPrice bookPrice = bookPriceService.getBookPriceById(bookId);
        return bookPrice;
    }
    @GetMapping("/offeredPrice/{bookId}")
    public double getOfferedPrice(@PathVariable Integer bookId) {
        log.info("---BookPriceController---getOfferedPrice()-----");
        double offeredPrice = bookPriceService.getOfferedPriceById(bookId);
        return offeredPrice;
    }
}
