package com.ramesh.springreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramesh.springreact.entity.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Integer> {

	Contacts findByName(String name);

}
