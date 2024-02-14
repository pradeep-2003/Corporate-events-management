package com.example.sample.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sample.Entity.eventadd;
import java.util.List;

@Repository
public interface eventrepo extends JpaRepository<eventadd, Integer>{
    
    @Query(value="select * from book where type=?",nativeQuery=true)
    public List<eventadd> findById(String type);
}