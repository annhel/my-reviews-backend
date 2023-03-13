package com.revature.myreviewssb.repository;

import com.revature.myreviewssb.entity.ShowReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowReviewRepository extends JpaRepository<ShowReview, Long> {
    List<ShowReview> findByName(String name);
}
