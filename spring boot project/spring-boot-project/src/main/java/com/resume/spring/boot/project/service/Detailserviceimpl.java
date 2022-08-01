package com.resume.spring.boot.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.spring.boot.project.dao.Detaildao;
import com.resume.spring.boot.project.entity.Detail;




@Service
public class Detailserviceimpl implements Detailservice {
	
	@Autowired
	private Detaildao detaildao;
	
	@Override
	public String editDetail(Detail data) {
		
		
		Detail d=new Detail();
		d.setId(1);
		d.setEmail(data.getEmail());
		d.setAddress(data.getAddress());
		d.setMobileNumber(data.getMobileNumber());
		try {
			Detail a=detaildao.save(d);
		 if(a!=null)
		 {
		 return "Success";
		 }
		 return "Somthing wrong";
		}catch(Exception e){
			return "Exception";
		}
		
		
        
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Detail getDetail() {
		try {
         Detail data=new Detail();
         long i=1;
		data.setId(detaildao.getById(i).getId());
		data.setAddress(detaildao.getById(i).getAddress());
		data.setEmail(detaildao.getById(i).getEmail());
		data.setMobileNumber(detaildao.getById(i).getMobileNumber());
		
		
		return data;
		}
		catch(Exception e) {
			return null;
		}
		
	}
	
}
