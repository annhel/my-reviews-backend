package com.revature.myreviewssb.service;

import com.revature.myreviewssb.entity.ShowReview;

import java.util.List;

public interface ShowReviewService {
    ShowReview insert(ShowReview show);

    ShowReview getById(Long id);

    List<ShowReview> getAll();

    ShowReview update(ShowReview show);

    boolean delete(Long id);

    List<ShowReview> findByName(String name);
}
