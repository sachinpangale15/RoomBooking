package sendingMail.Email.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendSimpleMail(String toMail,
			String body,
			String subject) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("pangale7171@gmail.com");
		message.setTo(toMail);
		message.setText(body);
		message.setSubject(subject);
		
		javaMailSender.send(message);
		
		System.out.println("Simple message is sent"+toMail);
		
		
		
		
		
		
	}

}
