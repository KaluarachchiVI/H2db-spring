package com.victaz.sms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.victaz.sms.entity.Staff;
import com.victaz.sms.repository.StaffRepo;

@Service
public class StaffService {

	@Autowired
	private StaffRepo repository;

	public Staff addStaff(Staff staff) {
		// return the Staff object with id to the user
		System.out.println("Received staff: " + staff.getFname() + " " + staff.getLname());
		return repository.save(staff);
	}

	public List<Staff> getStaff() {
		return repository.findAll();
	}

	public Staff getStaffMemByID(int stfId) {
		Optional<Staff> optionalStaff = repository.findById(stfId);
		Staff stf = null;
		if (optionalStaff.isPresent()) {
			stf = optionalStaff.get();
		} else {
			throw new RuntimeException("Employee not found for id:" + stfId);
		}
		return stf;
	}

	public Staff editStaff(Staff staff) {
		Staff existStaff = repository.getReferenceById(staff.getStfId());
		existStaff.setFname(staff.getFname());
		existStaff.setLname(staff.getLname());
		existStaff.setSalary(staff.getSalary());
		return repository.save(existStaff);
	}

	public String deleteStf(int stfId) {
		repository.deleteById(stfId);
		return "Employee" + stfId + "deleted successfully";

	}
}
