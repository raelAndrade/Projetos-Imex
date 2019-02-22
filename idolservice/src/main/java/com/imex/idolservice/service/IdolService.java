package com.imex.idolservice.service;

import com.imex.idolservice.dto.IDOLRequest;
import com.imex.idolservice.dto.IDOLResponse;

/**
 * IdolService -
 */
public interface IdolService {

    IDOLResponse queryDocsTextGet(String request);
    IDOLResponse queryDocsTextPost(IDOLRequest request);

}