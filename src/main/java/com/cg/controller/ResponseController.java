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
	public Response editAccuracy(@PathVariable("id") int respId, @PathVariable("accuracy") int accuracy)
	{

		return responseService.editAccuracy(respId, accuracy);
	}
	
	
	@GetMapping(value= "/likeResponse/{id}/{accuracy}")
	public  List<Response> likeResponse(@PathVariable("id") int respId,@PathVariable("accuracy") int accuracy)
	{
		return responseService.likeResponse(respId,accuracy);
	}
	
	
	@DeleteMapping("/deleteResponse/{id}")
	public List<Response> deleteResponse(@PathVariable("id") int respId)
	{
		return responseService.deleteResponse(respId);
	}
	
	
/*	@GetMapping("/getByDevId/{id}")
	public Optional<Response> getFeedsByDeveloper(@PathVariable("id") int respId)
	{
		return responseService.getFeedsByDeveloper(respId);
	}
	
	
	@GetMapping("/getByFeedId/{id}")
	public Optional<Response> getFeedsByFeed(@PathVariable("id") int respId)
	{
		return responseService.getFeedsByFeed(respId);
	}*/
	
}