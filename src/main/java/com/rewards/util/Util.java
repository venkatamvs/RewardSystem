package com.rewards.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.rewards.model.Rewards;

public class Util {
	
	public static List<Rewards> getDataSet() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		// 1st Customer
		Rewards reward1 = new Rewards();
		reward1.setCustomerName("customer1");
		reward1.setPurchaseAmount(100);
		reward1.setCreatedDate(sdf.parse("13/11/2021"));
		
		Rewards reward2 = new Rewards();
		reward2.setCustomerName("customer1");
		reward2.setPurchaseAmount(40);
		reward2.setCreatedDate(sdf.parse("01/12/2021"));
		
		Rewards reward3 = new Rewards();
		reward3.setCustomerName("customer1");
		reward3.setPurchaseAmount(140);
		reward3.setCreatedDate(sdf.parse("01/10/2021"));
		
		Rewards reward4 = new Rewards();
		reward4.setCustomerName("customer1");
		reward4.setPurchaseAmount(80);
		reward4.setCreatedDate(sdf.parse("01/12/2021"));
		
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
		list.add(reward1);
		list.add(reward2);
		list.add(reward3);
		list.add(reward4);
		list.add(c1);
		list.add(c2);
		
		return list;
	}

}
