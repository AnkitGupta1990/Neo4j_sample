package neo4j

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity(type="SKILLS")
class Relationship {

	@GraphId Long graphId

	@StartNode Person person
	@EndNode Skills skills
}
