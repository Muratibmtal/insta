package business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import database.İnstagramDao;
import entity.İnstagramentity;
@Service
public abstract  class İnstagramManager  implements İnstagramDao{
	private İnstagramManager instagramdao;
	@Autowired
	public İnstagramManager(İnstagramManager instagramdao) {
		super();
		this.instagramdao = instagramdao;
	}
	public ArrayList<İnstagramentity> getAll(){
		return new ArrayList<İnstagramentity>(instagramdao.findAll());
	}
	}