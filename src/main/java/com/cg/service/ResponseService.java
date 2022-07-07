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
	private Integer respId;
	
	public String addResponse(Response response)
	{
		responserepository.save(response);
		return "Response added";
	}
	

	public Response editAccuracy(int respId,int accuracy) {
		Response response =responserepository.findById(respId).get();
		response.setAccuracy(accuracy);
		return responserepository.save(response);
	}
	public List<Response> likeResponse(int respId, int accuracy){
		if(!responserepository.existsById(respId)) {
			throw new ResponseNotFoundException();
		}
		
	    Response response = responserepository.findById(respId).get();
	    response.setAccuracy(accuracy);
	    return responserepository.findAll();
	}

	
	public List<Response> deleteResponse(int respId) {
		responserepository.deleteById(respId);
		return responserepository.findAll();

}

	/*public Optional<Response> getFeedsByDeveloper(int devId) {
		return responserepository.findById(devId);

	}

	public Optional<Response> getFeedsByFeed(int feedId) {
		return responserepository.findById(feedId);
	}*/

	

	
	}



	
	