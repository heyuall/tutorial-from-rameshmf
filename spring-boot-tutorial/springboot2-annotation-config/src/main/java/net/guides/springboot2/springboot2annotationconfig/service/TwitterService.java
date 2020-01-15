package net.guides.springboot2.springboot2annotationconfig.service;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
