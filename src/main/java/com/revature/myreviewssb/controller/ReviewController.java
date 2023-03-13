package com.revature.myreviewssb.controller;

import com.revature.myreviewssb.entity.ShowReview;
import com.revature.myreviewssb.service.ShowReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@CrossOrigin("*")
public class ReviewController {
    // automatically inject bean into field
    @Autowired
    ShowReviewService showReviewService;

    // using the mapping annotations for Post, Get, Put, Delete

    @PostMapping()
    public ShowReview insert(@RequestBody ShowReview showReview){
        return showReviewService.insert(showReview);
    }

    @RequestMapping(value="", method= RequestMethod.GET)
    public List<ShowReview> getAll(){
        return showReviewService.getAll();
    }

    @GetMapping("/{id}")
    public ShowReview getById(@PathVariable("id") Long id){
        return showReviewService.getById(id);
    }

    @PutMapping()
    public ShowReview update(@RequestBody ShowReview showReview){
        return showReviewService.update(showReview);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){
        return showReviewService.delete(id);
    }

//    //Get ShowReview by Name
//    @GetMapping("/{showReviewName}")
//    public List<ShowReview> getByName(@PathVariable("showReviewName") String name){
//        return showReviewService.findByName(name);
//    }
}
