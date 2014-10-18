package neo4j

import org.neo4j.graphalgo.GraphAlgoFactory

class PersonController {

	def personService
	def SkillsRepository

	def savePerson(){
		println params
		def skills= request.getParameterMap()
		def status=personService.savePerson(skills)
		respond CommonUtil.generateSuccessResponse(status),[formats:['json']]
	}

	def saveSkills(){
		println params
		String response=personService.saveSkills(params)
		respond CommonUtil.generateSuccessResponse(response),[formats:['json']]
	}

	def getSkills(){
		def skills=personService.getSkills()
		respond CommonUtil.generateSuccessResponse(skills),[formats:['json']]
	}

	def getPersons(){
		def result=personService.getPersons()
		respond CommonUtil.generateSuccessResponse(result),[formats:['json']]
	}
	
	def delete(){
		personService.delete()
	}
	
}
