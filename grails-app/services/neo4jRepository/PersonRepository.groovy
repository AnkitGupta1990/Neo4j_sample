package neo4jRepository



import neo4j.Person

import org.springframework.data.neo4j.repository.GraphRepository

public interface PersonRepository extends GraphRepository<Person>{

	Person findByGraphId(long  id)

	Person findByName(String name)
}
