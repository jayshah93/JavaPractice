package com.jay.microservices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

//import com.jay.domain.CustomerFindByNameRequest;
import com.jay.domain.*;
//import com.jay.domain.Status;
//import com.jay.domain.Entry;

@Service
public class MicroservicesMain {
	
	private Map<Integer, Entry> db = new HashMap<>();
	
	public MicroservicesMain() {
		db.put(1, new Entry(10, "jay"));
		db.put(2, new Entry(11, "jen"));
		db.put(3, new Entry(12, "sega"));
		db.put(4, new Entry(13, "dhruvi"));
		
	}
	public ResponseEntity<?> findbyName(CustomerFindByNameRequest request){
	List <Entry> result = new ArrayList<Entry>();
	Status status=Status.NO_NAME_MATCH;
	String name= StringUtils.trimAllWhitespace(request.getName());
	if(name!=null) {
		for (Entry entry:db.values()) {
			if(StringUtils.startsWithIgnoreCase(entry.getName(),name)) {
				result.add(entry);
				status=Status.SUCCESS;
				
			}
		}
		}
	FindByNameResponse response=new FindByNameResponse(result,status);
	return new ResponseEntity<FindByNameResponse>(response,HttpStatus.OK);
	
	
	}
	public ResponseEntity<?> findById(int itemId) {
		List<Entry> result = new ArrayList<>();
		Status status = Status.NO_NAME_MATCH;
		if (db.containsValue(db.get(itemId))) {
			result.add(db.get(itemId));
			status = Status.SUCCESS;
		}
		FIndByIdResponse response = new FIndByIdResponse(result, status);
		return new ResponseEntity<FIndByIdResponse>(response, HttpStatus.OK);
		
	}

}
