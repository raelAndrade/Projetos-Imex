package com.imex.idolservice.controller;

import com.imex.idolservice.dto.IDOLRequest;
import com.imex.idolservice.dto.IDOLResponse;
import com.imex.idolservice.service.impl.IdolServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/idol/service")
public class IdolServiceController {

    @Autowired
    private IdolServiceImpl idolService;

    @GetMapping(value = "/query/{queryText}")
    public ResponseEntity<IDOLResponse> getAllDocsGet(@PathVariable String queryText) {
        IDOLResponse idolResponse = idolService.queryDocsTextGet(queryText);
        return ResponseEntity.ok(idolResponse);
    }

    @PostMapping(value="/query")
    public ResponseEntity<IDOLResponse> getAllDocsPost(@RequestBody IDOLRequest idolRequest){
        IDOLResponse idolResponse = idolService.queryDocsTextPost(idolRequest);
        return ResponseEntity.ok(idolResponse);
    }

}