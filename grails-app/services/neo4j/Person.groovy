package neo4j

import org.springframework.data.neo4j.annotation.GraphId
import org.springframework.data.neo4j.annotation.NodeEntity
import org.springframework.data.neo4j.annotation.RelatedTo
import org.springframework.data.neo4j.annotation.RelatedToVia;


@NodeEntity
class Person {

	@GraphId Long graphId;

	String name;
	
	@RelatedTo(type='SKILLS')
	Set<Skills> skills
	
	@RelatedToVia(type="SKILLS")
	Set<Relationship> relationship
}
