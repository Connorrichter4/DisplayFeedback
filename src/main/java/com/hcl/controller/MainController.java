package com.hcl.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.FeedbackEntity;
import com.hcl.repository.FeedbackRepository;

@RestController
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index.html");
	}
	
	@GetMapping("/show")
	public Iterable<FeedbackEntity> getAllFeedback(){
		return feedbackRepository.findAll();
	}
	
	@PostMapping("/add")
	public ModelAndView postFeedBack(FeedbackEntity feedback) {
		logger.info(feedback.toString());
		feedbackRepository.save(feedback);
		return new ModelAndView("redirect:/show");
	}
	
}
