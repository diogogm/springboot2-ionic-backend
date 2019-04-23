package com.diogogm.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.diogogm.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
