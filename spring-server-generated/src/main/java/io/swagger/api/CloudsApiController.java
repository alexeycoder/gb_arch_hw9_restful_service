package io.swagger.api;

import io.swagger.model.Cloud;
import io.swagger.model.Clouds;
import io.swagger.model.Error;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-20T16:15:31.919070397Z[GMT]")
@RestController
public class CloudsApiController implements CloudsApi {

    private static final Logger log = LoggerFactory.getLogger(CloudsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CloudsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Cloud> addCloud(@Parameter(in = ParameterIn.DEFAULT, description = "Размещает заказ на выделение новых ресурсов в облаке", schema=@Schema()) @Valid @RequestBody Cloud body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cloud>(objectMapper.readValue("{\n  \"os\" : \"windows\",\n  \"cpu\" : 8,\n  \"hdd\" : 10000,\n  \"cloud_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"client_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"ram\" : 128\n}", Cloud.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cloud>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cloud>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> cancelCloudById(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа в облаке", required=true, schema=@Schema()) @PathVariable("cloud_id") UUID cloudId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Clouds> getAllClouds() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Clouds>(objectMapper.readValue("[ {\n  \"os\" : \"windows\",\n  \"cpu\" : 8,\n  \"hdd\" : 10000,\n  \"cloud_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"client_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"ram\" : 128\n}, {\n  \"os\" : \"windows\",\n  \"cpu\" : 8,\n  \"hdd\" : 10000,\n  \"cloud_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"client_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"ram\" : 128\n} ]", Clouds.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Clouds>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Clouds>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cloud> getCloud(@Parameter(in = ParameterIn.PATH, description = "Идентификатор заказа в облаке", required=true, schema=@Schema()) @PathVariable("cloud_id") UUID cloudId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cloud>(objectMapper.readValue("{\n  \"os\" : \"windows\",\n  \"cpu\" : 8,\n  \"hdd\" : 10000,\n  \"cloud_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"client_id\" : \"c229ad20-048d-4f52-8d9d-2ebb7c645d8e\",\n  \"ram\" : 128\n}", Cloud.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cloud>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cloud>(HttpStatus.NOT_IMPLEMENTED);
    }

}
