package com.AOP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.AOP.mapper.Sample1Mapper;
import com.AOP.mapper.Sample2Mapper;

import lombok.Setter;

@Service
public class SampleTxServiceImpl implements SampleTxService {
	@Setter(onMethod_=@Autowired)
	private Sample1Mapper mapper1;
	
	@Setter(onMethod_=@Autowired)
	private Sample2Mapper mapper2;

	@Transactional
	@Override
	public void addData(String value) {
		System.out.println("mapper1.................................");
		mapper1.insertCol1(value);
		
		System.out.println("mapper2.................................");
		mapper2.insertCol2(value);
		
		System.out.println("end...................................");
		
	}

}
