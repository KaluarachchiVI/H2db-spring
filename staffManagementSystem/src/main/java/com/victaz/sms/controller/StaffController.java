package com.victaz.sms.controller;

import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.victaz.sms.entity.Staff;
import com.victaz.sms.service.StaffService;

@RestController
public class StaffController {

	@Autowired
	private StaffService service;

	@PostMapping("/addStaff")
	public Staff saveStaff(@RequestBody Staff staff)
	{
		return service.addStaff(staff);
	}
	
	@GetMapping("/getStaff")
	public List <Staff> getAll()
	{
		return service.getStaff();
	}
	
	@GetMapping("/getStfMember")
	public Staff getStfMem(@RequestParam("stfId") int stfId)
	{
		return service.getStaffMemByID(stfId);
	}
	
	@PutMapping("/editStaff")
	public Staff updateStaff(@RequestBody Staff staff)
	{
		return service.editStaff(staff);
	}
	
	@DeleteMapping("/deleteStaff")
	public String deleteStaff(@RequestParam("stfId") int stfId)
	{
		return service.deleteStf(stfId);
	}
}
