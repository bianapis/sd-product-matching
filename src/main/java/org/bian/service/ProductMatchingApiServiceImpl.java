/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ProductMatchingApiServiceImpl implements ProductMatchingApiService {

	public NextBestWithIds authorize(NextBest request){
		return JsonReader.read("authorize-NextBestWithIds.json",new TypeReference<NextBestWithIds>(){});
	}
	
	public NextBestWithIds evaluate(NextBest request){
		return JsonReader.read("evaluate-NextBestWithIds.json",new TypeReference<NextBestWithIds>(){});
	}
	
	public GuidelinesWithIds requestPostGuidelines(String crReferenceId, Guidelines request){
		return JsonReader.read("requestPost-GuidelinesWithIds.json",new TypeReference<GuidelinesWithIds>(){});
	}
	
	public GuidelinesWithIds requestPutGuidelines(String crReferenceId, String bqReferenceId, Guidelines request){
		return JsonReader.read("requestPut-GuidelinesWithIds.json",new TypeReference<GuidelinesWithIds>(){});
	}
	
	public NextBestWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-NextBestWithIds.json",new TypeReference<NextBestWithIds>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
