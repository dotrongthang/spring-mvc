package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
