package com.cg.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Response;
import com.cg.service.ResponseService;

@RestController
public class ResponseController {
	
	@Autowired
	private ResponseService responseService;
	
	
	@PostMapping("/addResponse")
	public String addResponse (@RequestBody Response response) { 
		return responseService.addResponse(response);
	}
	@PutMapping("/editAccuracy/{id}/{accuracy}")
	public List<Response> editAccuracy(@PathVariable("id") int respId, @PathVariable("accuracy") int accuracy)
	{

		return responseService.editAccuracy(respId, accuracy);
	}
	
	@PutMapping("/likeResponse/{id}")
	public List<Response> likeResponse(@PathVariable("id") int respId)
	{
		return responseService.likeresponse(respId);
	}
	
	@PutMapping("/removeResponse/{id}")
	public List<Response>removeResponse(@PathVariable("id") int respId)
	{
		return responseService.removeresponse(respId);
	}
	
	
	@GetMapping(value= "/getResponse/{id}")
	public  Response getResponse(@PathVariable("id") int respId)
	{
		return responseService.getById(respId);
	}
	
	@DeleteMapping("/deleteResponse/{id}")
	public List<Response> deleteResponse(@PathVariable("id") int respId){
		return responseService.deleteResponse(respId);
	}
	
	/*@GetMapping("/getByDevId/{id}")
	public List<Response> getFeedsByDeveloper(@PathVariable("id") int respId)
	{
		return responseService.getResponseByDeveloper(respId);
	}
	
	@GetMapping("/getByFeed/{feedId}")
	public Optional<Response> getFeedsByFeed(@PathVariable("id")int respId )
	{
		return responseService.getResponseByFeed(respId);
	}*/
}
	

	
