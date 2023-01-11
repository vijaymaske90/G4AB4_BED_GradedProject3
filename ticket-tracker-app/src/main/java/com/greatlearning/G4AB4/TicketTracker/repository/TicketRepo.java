package com.greatlearning.G4AB4.TicketTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.greatlearning.G4AB4.TicketTracker.entity.Ticket;

import java.util.List;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Integer> {

	String entityName = "Ticket";

	@Query(value = "SELECT e FROM " + entityName + " e WHERE e.title LIKE %:title%")
	List<Ticket> findByTitle(@Param("title") String title);
}