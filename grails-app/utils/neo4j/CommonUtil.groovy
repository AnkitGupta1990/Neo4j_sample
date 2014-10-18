package neo4j

class CommonUtil {
	
	def static generateSuccessResponse(def data){
		HashMap result = new HashMap()
		result.isSuccess = true;
		result.data = data;
		result.errorMessage = "";
		return result;
	}
	
	def static generateFailureResponse(def exception,def errorMessage){
		HashMap result = new HashMap()
		result.isSuccess = false;
		result.data = null;
		result.errorMessage = exception == null ? errorMessage : exception.getMessage();
		return result;
	}

}
