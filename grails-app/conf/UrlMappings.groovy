class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
		
		"/savePerson"(controller:" person", parseRequest: true){
			action = [GET:" savePerson"]
		}
		
		"/saveSkills"(controller:" person", parseRequest: true){
			action = [GET:" saveSkills"]
		}
		
		"/getSkills"(controller:" person", parseRequest: true){
			action = [GET:" getSkills"]
		}
		"/getPersons"(controller:" person", parseRequest: true){
			action = [GET:" getPersons"]
		}
		
	}
}
