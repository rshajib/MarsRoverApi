package com.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.dto.HomeDto;

public interface PreferencesRepository extends JpaRepository<HomeDto, Long> {
  HomeDto findByUserId(Long userId);
}
