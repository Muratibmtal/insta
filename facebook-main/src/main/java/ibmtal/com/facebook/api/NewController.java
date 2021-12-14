package ibmtal.com.facebook.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.NewService;
import ibmtal.com.facebook.entity.News;


@RestController
@RequestMapping("/api/news")
public class NewController {

	private NewService neewService;
	@Autowired
	public NewController(NewService neewService) {
		super();
		this.neewService = neewService;
	}
	
	@GetMapping("/getall")
	public ArrayList<News> allNews() {
		return null;
	}

}
