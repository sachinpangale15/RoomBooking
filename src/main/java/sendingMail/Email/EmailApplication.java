package sendingMail.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import sendingMail.Email.Service.HomeService;

@SpringBootApplication
public class EmailApplication {
	
	@Autowired
	HomeService homeService;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}	
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail() {
			homeService.sendSimpleMail("sachin.s.pangale@gmail.com", 
					"this is body of email", 
					"Sachin Pangale Java Developer");
			
		}
	

}
