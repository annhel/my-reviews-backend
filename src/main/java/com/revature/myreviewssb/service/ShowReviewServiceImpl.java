package com.revature.myreviewssb.service;

import com.revature.myreviewssb.entity.ShowReview;
import com.revature.myreviewssb.repository.ShowReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowReviewServiceImpl implements ShowReviewService {

    @Autowired
    ShowReviewRepository showReviewRepository;

    @Override
    public ShowReview insert(ShowReview showReview) {
        return showReviewRepository.save(showReview);
    }

    @Override
    public ShowReview getById(Long id) {
        return showReviewRepository.findById(id).get();
    }

    @Override
    public List<ShowReview> getAll() {
        return showReviewRepository.findAll();
    }

    @Override
    public ShowReview update(ShowReview showReview) {
        return showReviewRepository.save(showReview);
    }

    @Override
    public boolean delete(Long id) {
        boolean found = showReviewRepository.existsById(id);
        if(found) showReviewRepository.deleteById(id);
        return found;
    }

    @Override
    public List<ShowReview> findByName(String name) {
        return showReviewRepository.findByName(name);
    }
}
