package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Detial;
import com.example.demo.repository.DetialRepository;


@Service
public class DetialService {
	
	 @Autowired
		public DetialRepository detialrepo;
	    
	    public List<Detial> getAllDetials()
	    {
	    	List<Detial> detials = new ArrayList<>();
	    	detialrepo.findAll().forEach(detials::add);
	    	return detials;
	    }
	    
	    public void addDetials(Detial detial)
	    {
	    	detialrepo.save(detial);
	    }
	    
	    public void updateDetials(String sno,Detial detial)
	    {
	    	detialrepo.save(detial);
	    }
	    public void deleteDetials(String sno)
	    {
	    	detialrepo.deleteById(sno);
	    }

}
