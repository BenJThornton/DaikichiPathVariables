package com.codingdojo.firstspringproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String Welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping(value="/tomorrow", method= RequestMethod.GET)
	public String tomorrow() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{destination}")
	public String displayTravel(@PathVariable("destination") String destination) {
		return "Congratulations!  You will soon travel to " + destination + "!";
	}
	
	@RequestMapping("/lotto/{num}")
	public String displayLotto(
			@PathVariable("lotto") String lotto,
			@PathVariable("num") int num){
				if(num % 2 == 0) {
					return "You will take a grand journey in the future, but be wary of tempting offers.";
				}else {
					return "You have enjoyed the fruits of your labor.";
				}
			}
	}	

