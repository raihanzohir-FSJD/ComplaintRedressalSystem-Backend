package com.simpli.fsjd.capstone.crs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpli.fsjd.capstone.crs.entity.User;

/**
 * Created by Md. Zohir Raihan
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
