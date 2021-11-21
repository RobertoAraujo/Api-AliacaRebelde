package com.poshyweb.repository;

import com.poshyweb.model.Rebelde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RebeldeRepository extends JpaRepository<Rebelde, Long> {
    public List<Rebelde>findAllBy();
    //public List<Rebelde>findAllById();

}
