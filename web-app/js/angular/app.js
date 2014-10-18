var vcoinexchange = angular.module('volcare', [ 'ngRoute', 'ngResource','checklist-model']);

vcoinexchange.config([ '$routeProvider', '$httpProvider',
		function($routeProvider, $http) {
			$routeProvider.when('/', {
				templateUrl : 'view/skills.html',
				controller : 'skills'

			}).when('/person', {
				templateUrl : 'view/person.html',
				controller : 'person'

			}).otherwise({
				redirectTo : '/'
			});

		} ]);
