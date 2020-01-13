package com.project.demo.main.service;

import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.project.demo.main.dao.SignRepository;
import com.project.demo.main.entity.Sign;

@Service
public class SignServices {
 
	@Autowired
	private SignRepository signrepository;
	
	public List<Sign> findall(){
		return signrepository.findAll();
	}
	
	
	public void signin(int employee_id) {
        signrepository.signin(employee_id);
	}
	public void update(int employee_id) {
		signrepository.update(employee_id);
	}
	public List<String> selectHistory(String employee_name){
		return signrepository.selectHistory(employee_name);
	}
	

}
