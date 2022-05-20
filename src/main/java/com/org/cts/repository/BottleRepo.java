package com.org.cts.repository;

import com.org.cts.model.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BottleRepo extends JpaRepository<Bottle,Integer> {
}
