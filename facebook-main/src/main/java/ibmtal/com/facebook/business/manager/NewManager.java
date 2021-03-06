package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.NewService;
import ibmtal.com.facebook.database.NewDao;
import ibmtal.com.facebook.entity.News;
@Service
public class NewManager implements NewService {
	private NewDao newdao;
	@Autowired
	public NewManager(NewDao newdao) {
		super();
		this.newdao = newdao;
	}
	@Override
	public ArrayList<News> getAll(){
		return new ArrayList<News>(newdao.findAll());
	}
}   