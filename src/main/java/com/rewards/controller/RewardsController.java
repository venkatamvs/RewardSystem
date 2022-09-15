package com.rewards.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.dto.CustomerRewardsDTO;
import com.rewards.service.RewardsService;
import com.rewards.util.Util;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RewardsController {
	@Autowired
	private RewardsService rewardsService;
	
	@GetMapping("/createTestData")
	public String createTestData() throws ParseException{
		rewardsService.insertData(Util.getDataSet());
		return "Test Data is inserted";
	}
	@GetMapping("/getRewards")
	public CustomerRewardsDTO getRewards(@RequestParam("name") String name) throws ParseException{
		return rewardsService.getRewardPoints(name);
	}
}
