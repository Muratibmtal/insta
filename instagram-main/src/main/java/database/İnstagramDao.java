package database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import entity.─░nstagramentity;

@Service
public interface ─░nstagramDao  extends JpaRepository<─░nstagramentity, Integer>{

}
