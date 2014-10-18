package neo4jRepository



import neo4j.Person
import neo4j.Skills

import org.springframework.data.neo4j.repository.GraphRepository

public interface SkillsRepository extends GraphRepository<Skills>{

	Skills findBySkills(String skills )
}
