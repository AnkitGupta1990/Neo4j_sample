'use strict';

angular.module('volcare').factory('personService',
		[ '$resource', function($resource) {
			var dataResource = $resource('person', {

			}, {
				savePerson : {
					url : 'savePerson',
					method : "GET"
				},
				
				
					saveSkills : {
						url : 'saveSkills',
						method : "GET"
					},
					
					getSkills: {
						url : 'getSkills',
						method : "GET"
					},
					
					getPersons: {
						url : 'getPersons',
						method : "GET"
					},
			});
			return dataResource;
		} ]);

