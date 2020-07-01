package com.jay.customercontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jay.domain.*;
import static java.net.HttpURLConnection.*;
//import com.jay.domain.CustomerFindByNameRequest;
//import com.jay.domain.FindByNameResponse;
//import com.jay.domain.ServiceErrorResponse;
import com.jay.microservices.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/customer/services")
@Api(value="/customer/services", tags= ("Customer Services"))
@CrossOrigin(maxAge = 3600)
public class CustomerController {
	
	private static final String CLIENT_ID = "client-id";
	private MicroservicesMain customerServices;
	

	@Autowired
	public CustomerController(MicroservicesMain customerServices) {
		this.customerServices = customerServices;
	}



	@RequestMapping(value="findByName", method= RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ApiOperation(value="findByName", notes= "Find by name in customer services", nickname = "findByName")
	@ApiResponses(value = {@ApiResponse(code = 400, message = "Missing / Invalid Parameter", response = ServiceErrorResponse.class),
			@ApiResponse(code = 200, message = "Success", response = FindByNameResponse.class)})
	public ResponseEntity<?> findByName( @RequestHeader(value = "CLIENT_ID")String clientId, @Valid @RequestBody CustomerFindByNameRequest request){
		return customerServices.findbyName(request);
	}
	
	@RequestMapping(value = "all/{itemId}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "FindByID", nickname = "all/{id}", notes = "FindByID.")
	@ApiResponses(value = {@ApiResponse(code = 400, message = "Missing / Invalid parameter", response = ServiceErrorResponse.class),
			@ApiResponse(code = HTTP_OK, message = "Success", response = FIndByIdResponse.class),
			@ApiResponse(code = HTTP_BAD_REQUEST, message = "Invalid Request", response = ServiceErrorResponse.class),
			@ApiResponse(code = HTTP_NO_CONTENT, message = "No Data Found", response = ServiceErrorResponse.class),
			@ApiResponse(code = HTTP_INTERNAL_ERROR, message = "Internal Server Error", response = ServiceErrorResponse.class)})
	public ResponseEntity<?> findById(@RequestHeader(value = CLIENT_ID) String clientId,
									  @ApiParam(value = "My Id", required = true, example = "3") @PathVariable("itemId") final int itemId) {
		return customerServices.findById(itemId);
	}

}
