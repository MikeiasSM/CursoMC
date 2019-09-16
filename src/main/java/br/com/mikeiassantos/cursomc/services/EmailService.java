package br.com.mikeiassantos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.mikeiassantos.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
