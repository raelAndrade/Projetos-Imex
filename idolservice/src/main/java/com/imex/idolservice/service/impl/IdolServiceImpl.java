package com.imex.idolservice.service.impl;

import com.imex.idolservice.dto.IDOLRequest;
import com.imex.idolservice.dto.IDOLResponse;
import com.imex.idolservice.service.IdolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * IdolServiceImpl
 */
@Service
public class IdolServiceImpl implements IdolService {

    ////////////////////////////// Get value of the files properties
    @Value("${services.idol.urlGet}")
    private String idolURLGet;

    @Value("${services.idol.urlPost}")
    private String idolURLPost;

    @Value("${services.idol.summaryType}")
    private String summaryType;
    /////////////////////////////////////////////////////////////////

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Override
    public IDOLResponse queryDocsTextGet(String queryText) {
        IDOLResponse idolResponse = restTemplate.getForObject(idolURLGet, IDOLResponse.class, queryText);
        return idolResponse;
    }

    @Override
    public IDOLResponse queryDocsTextPost(IDOLRequest request) {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("text", request.getText());
        map.add("summary", request.getSummary());
        HttpEntity<MultiValueMap<String, Object>> entityRequest = new HttpEntity<>(map);
        IDOLResponse idolResponse = restTemplate.postForObject(idolURLPost, entityRequest, IDOLResponse.class);
        return idolResponse;
    }

}