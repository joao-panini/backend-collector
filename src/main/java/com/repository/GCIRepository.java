package com.repository;

import com.entity.GCIEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GCIRepository extends JpaRepository<GCIEntity,Long> {
}
