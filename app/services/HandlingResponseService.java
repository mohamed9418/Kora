package services ;
import metaData.RequestResponse;
public class HandlingResponseService{
  public static String handleResponse(RequestResponse reqData){
    if(reqData.requestType == 1)
    return ChallangeService.responseToChallange(reqData);
    return "not complate yet";
  }
}
