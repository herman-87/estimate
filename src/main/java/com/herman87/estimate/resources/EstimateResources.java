package com.herman87.estimate.resources;

import org.SwaggerCodeGenExample.api.EstimatesApi;
import org.SwaggerCodeGenExample.model.EstimateDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class EstimateResources implements EstimatesApi {
    @Override
    public ResponseEntity<List<EstimateDTO>> getAllEstimates() {
        return ResponseEntity.status(OK).body(
                List.of(
                        new EstimateDTO().name("name1").description("description1"),
                        new EstimateDTO().name("name2").description("description2")
                )
        );
    }

    @GetMapping("/estimates1")
    public ResponseEntity<List<EstimateDTO>> getAllEstimates1() {
        return ResponseEntity.status(OK).body(
                List.of(
                        new EstimateDTO().name("name1").description("description1"),
                        new EstimateDTO().name("name2").description("description2")
                )
        );
    }
}
