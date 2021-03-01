package com.glaucus.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glaucus.entity.IncrementNumber;

public interface IncreementNumberDao extends JpaRepository<IncrementNumber, Integer> {

}
