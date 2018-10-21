/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProductMatchingApiService {

	NextBestWithIds authorize(NextBest request);
	
	NextBestWithIds evaluate(NextBest request);
	
	GuidelinesWithIds requestPostGuidelines(String crReferenceId, Guidelines request);
	
	GuidelinesWithIds requestPutGuidelines(String crReferenceId, String bqReferenceId, Guidelines request);
	
	NextBestWithIds retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
}
