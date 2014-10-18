var app=angular.module("volcare");
app.controller("person",["$scope","personService","$location",'$route',   function($scope,personService,$location,$route){


	
	
	$scope.skills=[{text:"java",value:"java"},
	                    {text:"grails",value:"grails"},
	                    {text:"c++",value:"c++"}
	      
	                    ];
	
	$scope.savePerson=function(data){
		console.log(data)
		if(data.name!=null && data.skills!=null){
		personService.savePerson(data,function(data){
			alert(data.data);
			$route.reload();
		})
		}else{
			alert("all fields are required")
		}
	}
	
	$scope.skills=[]
	$scope.getSkills=function(){
		personService.getSkills(function(data){
			angular.forEach(data.data, function(list,i) {
                var list = {};
                list.value = data.data[i].skills
                list.text = data.data[i].skills
                $scope.skills.push(list);
               });
		})
	}
	
	$scope.persons=[]
	$scope.getPersons=function(){
		personService.getPersons(function(data){
			$scope.persons=data.data
		})
	}
	
	$scope.getSkills()
	$scope.getPersons()
}])