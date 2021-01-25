package org.example.borrowing.controllers;


import org.example.borrowing.repos.BorrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v2/borrowing")
public class BorrowingController {

    @Autowired
    private BorrowingRepository borrowingRepository;

}
