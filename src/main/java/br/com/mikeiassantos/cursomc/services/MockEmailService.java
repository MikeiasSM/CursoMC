package br.com.mikeiassantos.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailServices {

	private static final Logger LOG = LoggerFactory.getLogger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Simulando Enviando Email...");
		LOG.info(msg.toString());
		LOG.info("Email Enviado!");
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Simulando Enviando Email HTML...");
		LOG.info(msg.toString());
		LOG.info("Email Enviado!");
		
	}

}
