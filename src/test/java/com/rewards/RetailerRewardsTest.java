package com.rewards;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rewards.dto.CustomerRewardsDTO;
import com.rewards.dto.RewardsDTO;
import com.rewards.model.Rewards;
import com.rewards.service.RewardsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RetailerRewardsTest {

	@Autowired
	private RewardsService rewardsService;
	
	@Before
	public void before() throws ParseException{

	}
	
	@Test
	public void getRewardPointsForCutomer1() throws ParseException {
		insertCustomer1Data();
		CustomerRewardsDTO  customerDetails = rewardsService.getRewardPoints("customer1");
		assertTrue(customerDetails.getTotalPoints() == 50);
		assertTrue(customerDetails.getRewards().size() == 2);
		List<RewardsDTO> rewards = customerDetails.getRewards();
		assertTrue(rewards.get(0).getMonth() == 11);
		assertTrue(rewards.get(0).getMonthPoints() == 50);
	}
	
	private void insertCustomer1Data() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Rewards reward1 = new Rewards();
		reward1.setCustomerName("customer1");
		reward1.setPurchaseAmount(100);
		reward1.setCreatedDate(sdf.parse("13/11/2021"));
		
		Rewards reward2 = new Rewards();
		reward2.setCustomerName("customer1");
		reward2.setPurchaseAmount(40);
		reward2.setCreatedDate(sdf.parse("01/12/2021"));
		List<Rewards> list = new ArrayList<>();
		list.add(reward1);
		list.add(reward2);
		rewardsService.insertData(list);
	}
	@Test
	public void getRewardPointsForCutomer2() throws ParseException{
		insertCustomer2Data();
		CustomerRewardsDTO  customerDetails = rewardsService.getRewardPoints("customer2");
		assertTrue(customerDetails.getTotalPoints() == 200);
		assertTrue(customerDetails.getRewards().size() == 2);
		List<RewardsDTO> rewards = customerDetails.getRewards();
		assertTrue(rewards.get(0).getMonth() == 11);
		assertTrue(rewards.get(0).getMonthPoints() == 90);
	}
	
	private void insertCustomer2Data() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		// 2nd Customer
		Rewards c1 = new Rewards();
		c1.setCustomerName("customer2");
		c1.setPurchaseAmount(120);
		c1.setCreatedDate(sdf.parse("11/11/2021"));
		
		Rewards c2 = new Rewards();
		c2.setCustomerName("customer2");
		c2.setPurchaseAmount(130);
		c2.setCreatedDate(sdf.parse("01/12/2021"));
		
		List<Rewards> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		
		rewardsService.insertData(list);
	}
}
