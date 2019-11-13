package com.wahine.vippsstats.repository;

import com.wahine.vippsstats.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends JpaRepository<Stats, Integer> {
}
