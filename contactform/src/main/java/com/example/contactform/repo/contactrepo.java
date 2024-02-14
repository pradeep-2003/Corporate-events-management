package com.example.contactform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.contactform.model.contact;
@Repository
public interface contactrepo extends JpaRepository<contact, Integer>{}