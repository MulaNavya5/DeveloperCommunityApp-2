package com.cg.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.entity.Response;
import com.cg.exception.ResponseNotFoundException;
import com.cg.repository.ResponseRepository;

@Service
public class ResponseService {

	@Autowired
	private ResponseRepository responserepository;
	
	public String addResponse(Response response)
	{
		responserepository.save(response);
		return "Response added";
	}
	
	public List<Response> editAccuracy(int rcode, int accuracy)
	{
		if(!responserepository.existsById(rcode))
		{
			throw new ResponseNotFoundException();
			
		}
		Response response= responserepository.findById(rcode).get();
	    response.setAccuracy(accuracy);
		responserepository.flush();
		return responserepository.findAll();
	}

	public List<Response> likeresponse(int respId) {
		return responserepository.findAll();

	
	}
	public Response getById(int respId) {
		return responserepository.findById(respId).get();

		  
	}

	public List<Response> deleteById(int respId) {
		 responserepository.deleteById(respId);
		 return responserepository.findAll();
	 }
	
	

	public Optional<Response> getResponseByDeveloper(int respId) {
		 return responserepository.findById(respId);

	
	}

	public Optional<Response> getResponseByFeed(int respId) {
		 return responserepository.findById(respId);

	
	}

	public List<Response> removeresponse(int respId) {
		return responserepository.findAll();

		
	}
	
	
	

	 
}

		

