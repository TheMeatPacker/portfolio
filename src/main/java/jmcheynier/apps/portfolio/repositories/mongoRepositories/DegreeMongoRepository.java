package jmcheynier.apps.portfolio.repositories.mongoRepositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import jmcheynier.apps.portfolio.models.mongoModel.Degree;

public interface DegreeMongoRepository extends MongoRepository<Degree, String> {
	
	public List<Degree> findByOrderByEndDateDesc();
	public List<Degree> findByCode(String type);
	public List<Degree> findByLevelGreaterThan(int level);
	
    @Query("{'level' : {$gte : ?0}}")
    public List<Degree> findByLevelGreaterThanQuery(String level);
}
