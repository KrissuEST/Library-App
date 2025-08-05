package com.kristjan.springbootlibrary.controller;

import com.kristjan.springbootlibrary.entity.Book;
import com.kristjan.springbootlibrary.response_models.ShelfCurrentLoansResponse;
import com.kristjan.springbootlibrary.service.BookService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/secure/currentloans")
    public List<ShelfCurrentLoansResponse> currentLoans(@AuthenticationPrincipal Jwt jwt)
            throws Exception
    {
        String userEmail = jwt.getClaim("https://luv2code-react-library.com/email");
//        String userEmail = jwt.getClaim("email");
        return bookService.currentLoans(userEmail);
    }

    // Get endpoint
    @GetMapping("/secure/currentloans/count")
    public int currentLoansCount(@AuthenticationPrincipal Jwt jwt) {
        String userEmail = jwt.getClaim("https://luv2code-react-library.com/email");
//        String userEmail = jwt.getClaim("email");
        return bookService.currentLoansCount(userEmail);
    }

    // Get endpoint
    @GetMapping("/secure/ischeckedout/byuser")
    public Boolean checkoutBookByUser(@AuthenticationPrincipal Jwt jwt,
                                      @RequestParam Long bookId) {
        // We are grabbing the token and passing it into
        String userEmail = jwt.getClaim("https://luv2code-react-library.com/email");
//        String userEmail = jwt.getClaim("email");
        return bookService.checkoutBookByUser(userEmail, bookId);
    }

    // Put endpoint
    @PutMapping("/secure/checkout")
    public Book checkoutBook (@AuthenticationPrincipal Jwt jwt,
                              @RequestParam Long bookId) throws Exception {
        String userEmail = jwt.getClaim("https://luv2code-react-library.com/email");
//        String userEmail = jwt.getClaim("email");
        return bookService.checkoutBook(userEmail, bookId);
    }

    @PutMapping("/secure/return")
    public void returnBook(@AuthenticationPrincipal Jwt jwt,
                           @RequestParam Long bookId) throws Exception {
        String userEmail = jwt.getClaim("https://luv2code-react-library.com/email");
//        String userEmail = jwt.getClaim("email");
        bookService.returnBook(userEmail, bookId);
    }

    @PutMapping("/secure/renew/loan")
    public void renewLoan(@AuthenticationPrincipal Jwt jwt,
                          @RequestParam Long bookId) throws Exception {
        String userEmail = jwt.getClaim("https://luv2code-react-library.com/email");
//        String userEmail = jwt.getClaim("email");
        bookService.renewLoan(userEmail, bookId);
    }
}