package com.greatlearning.G4AB4.TicketTracker.service;

import com.greatlearning.G4AB4.TicketTracker.entity.Ticket;
import com.greatlearning.G4AB4.TicketTracker.repository.TicketRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
	@Autowired
	private TicketRepo ticketRepo;

	@Override
	public List<Ticket> findAll(Sort sort) {
		return ticketRepo.findAll(sort);
	}

	@Override
	public Ticket findById(int id) {
		return ticketRepo.findById(id).get();
	}

	@Override
	public Ticket addOrUpdateTicket(Ticket ticket) {
		return ticketRepo.save(ticket);
	}

	@Override
	public void deleteTicket(Ticket ticket) {
		ticketRepo.delete(ticket);
	}

	@Override
	public List<Ticket> searchTicket(String title) {
		return ticketRepo.findByTitle(title);
	}
}