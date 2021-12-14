package ibmtal.com.facebook.database;

import org.springframework.data.jpa.repository.JpaRepository;


import ibmtal.com.facebook.entity.News;

public interface NewDao  extends JpaRepository<News, Integer>{

}
