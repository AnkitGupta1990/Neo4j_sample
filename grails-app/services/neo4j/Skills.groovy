package neo4j

import org.springframework.data.neo4j.annotation.GraphId
import org.springframework.data.neo4j.annotation.NodeEntity
import org.springframework.data.neo4j.annotation.RelatedTo

@NodeEntity
class Skills {

	@GraphId Long graphId;

	String skills

	@RelatedTo(type='SKILLS')
	Set<Person> person
}
