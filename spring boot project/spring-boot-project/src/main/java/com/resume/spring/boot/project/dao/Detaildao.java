package com.resume.spring.boot.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resume.spring.boot.project.entity.Detail;

public interface Detaildao extends JpaRepository<Detail,Long> {

}
