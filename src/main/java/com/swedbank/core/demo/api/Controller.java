package com.swedbank.core.demo.api;


import com.swedbank.andromeda.spacetime.lib.api.error.model.ApiError;
import com.swedbank.andromeda.spacetime.lib.api.error.model.ApiErrorBadRequest;
import com.swedbank.core.demo.api.model.Response;
import com.swedbank.core.demo.service.Service;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(value = "/", produces = "application/json")
@Tag(name = "Enter a name", description = "Enter a description of the operations.")
public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @Operation(summary = "Enter a summary of the operation here")
    @GetMapping("example")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Enter a description here", content = @Content(schema = @Schema(implementation = Response.class))),
            @ApiResponse(responseCode = "400", content = @Content(schema = @Schema(implementation = ApiErrorBadRequest.class))),
            @ApiResponse(responseCode = "500", content = @Content(schema = @Schema(implementation = ApiError.class)))
    })
    public Response createString() {
        return service.performAction();
    }
}
