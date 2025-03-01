package com.victaz.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.victaz.sms.entity.Staff;

@Repository
public interface StaffRepo extends JpaRepository <Staff, Integer> {

}
