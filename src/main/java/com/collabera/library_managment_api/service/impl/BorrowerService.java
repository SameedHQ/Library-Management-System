package com.collabera.library_managment_api.service.impl;

import com.collabera.library_managment_api.dto.BorrowerDTO;

import java.util.List;

public interface BorrowerService {
    BorrowerDTO registerBorrower(BorrowerDTO borrowerDTO);
    void borrowBook(Long borrowerId, Long bookId);
    void returnBook(Long borrowerId, Long bookId);
    List<BorrowerDTO> getAllBorrowers();

    BorrowerDTO getBorrowerById(Long borrowerId);
}