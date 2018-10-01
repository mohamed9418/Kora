package services;
import metaData.NotificationData;
import java.util.List;
import java.util.ArrayList;
public class NotifictionService{
  public static List<NotificationData> getNotificiton (int SID){
    List<NotificationData> allData=new ArrayList<>();
    allData.addAll(teamServices.PlayerTeamNotificaiton(SID));
    allData.addAll(PlayerService.getMyRequest(SID));
    return allData;
}
}
