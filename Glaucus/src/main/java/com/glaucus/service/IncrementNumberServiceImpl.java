package com.glaucus.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glaucus.dao.IncreementNumberDao;
import com.glaucus.entity.IncrementNumber;

@Service("inrementNumberServiceImpl")
public class IncrementNumberServiceImpl implements IncrementNumberServiceI {

	@Autowired
	IncreementNumberDao increementNumberDao;

	final int id=1;
	AtomicInteger atomicInteger = new AtomicInteger(0);

	/*
	 *  @author : Ajita Mittal
	 *  @return : IncrementNumber Object
	 *  Updating value of counter
	 */
	
	@Override
	public IncrementNumber  getIncrement() {
		IncrementNumber incrementNumber = new IncrementNumber();
		try {
		int incCounter = atomicInteger.getAndIncrement();  // incrementing value

		incrementNumber.setId(id);
		incrementNumber.setIncreement(incCounter);   //Setting the incremented value
		increementNumberDao.save(incrementNumber);   // saving the latest incremented value
		return incrementNumber;
		}
		catch(Exception e)
		{
			return incrementNumber;
		}
	}

}
