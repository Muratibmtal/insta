package api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import business.services.İnstagramService;

@RestController
@RequestMapping("/api/instagram")
public class İnstagramController<İnstagram> {
     
	private İnstagramService instagramService;
	@Autowired
	public İnstagramController(İnstagramService instagramService) {
		super();
		this.instagramService = instagramService;
	}
	@GetMapping("/getall")
	public ArrayList<İnstagram> allİnstagram() {
		return null;
	}
}
