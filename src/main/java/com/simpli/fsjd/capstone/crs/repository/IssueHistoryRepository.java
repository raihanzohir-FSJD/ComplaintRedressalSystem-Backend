package com.simpli.fsjd.capstone.crs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpli.fsjd.capstone.crs.entity.IssueHistory;

import java.util.List;

/**
 * Created by Md. Zohir Raihan
 */
public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

    List<IssueHistory> getByIssueIdOrderById(Long id);
}
