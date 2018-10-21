/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class ProductMatchingApiController {

	@Autowired
	ProductMatchingApiService service;
	
	@Assess.Authorize
	public BianResponse<NextBestWithIds> authorize(@RequestBody BianRequest<NextBest> bianRequest) {
		return BianResponse.forSuccess(service.authorize(bianRequest.getData()));
	}
	
	@Assess.Evaluate
	public BianResponse<NextBestWithIds> evaluate(@RequestBody BianRequest<NextBest> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@BQ("guidelines")
	@Assess.RequestPost
	public BianResponse<GuidelinesWithIds> requestPostGuidelines(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<Guidelines> bianRequest) {
		return BianResponse.forSuccess(service.requestPostGuidelines(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("guidelines")
	@Assess.RequestPut
	public BianResponse<GuidelinesWithIds> requestPutGuidelines(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Guidelines> bianRequest) {
		return BianResponse.forSuccess(service.requestPutGuidelines(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<NextBestWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
