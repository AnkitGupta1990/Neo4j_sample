var app = angular.module("volcare");
app.controller("skills", [ "$scope", "personService", "$route",
		function($scope, homepageService, $route) {

			$scope.skills = [ {
				text : "java",
				value : "java"
			}, {
				text : "grails",
				value : "grails"
			}, {
				text : "c++",
				value : "c++"
			}

			];

			$scope.saveSkills = function(data) {

				data.skill = data.skill.toLowerCase().trim()
				homepageService.saveSkills(data, function(data) {
					alert(data.data);
					$route.reload();
				})
			}

		} ])