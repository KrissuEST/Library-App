package com.kristjan.springbootlibrary.dao;

import com.kristjan.springbootlibrary.entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

    Checkout findByUserEmailAndBookId(String userEmail, Long bookId);

    // How many checkouts user have all together, complete size of number of items
    // that user have checked out.
    List<Checkout> findBooksByUserEmail(String userEmail);
}