package Controller;
// Make By Bình An || AnLaVN || KatoVN

import static Controller.DatabaseData.GVDAO;
import static Controller.LocalData.*;
import com.AnLa.FILE.Log;
import com.AnLa.NET.Cloud;

public class CloudData {
    public static Cloud Cloudinary;
    
    public static void deleteAvatar(){
        if(CurrentGV.getAvatar().startsWith("http://res.cloudinary.com")){
            Log.add("Delete avatar from Cloudinary: "+CurrentGV.getAvatar());
            Cloudinary.FileDeleteByURL(CurrentGV.getAvatar());
        }
    }
    public static void uploadAvatar(){
        Log.add("Upload new Avatar from device: " + AVATAR);
        deleteAvatar();
        CurrentGV.setAvatar(Cloudinary.FileUpload(AVATAR, "EOA/AvatarTeacher/"));
        GVDAO.Update(CurrentGV);
        AVATAR = "src/User/"+CurrentID+".png";
        saveAvatar(CurrentGV.getAvatar());
    }
    public static void setAvatar(){
        Log.add("Upload new Avatar from link: " + AVATAR);
        deleteAvatar();
        CurrentGV.setAvatar(AVATAR);
        GVDAO.Update(CurrentGV);
        AVATAR = "src/User/"+CurrentID+".png";
        saveAvatar(CurrentGV.getAvatar());
    }
    
}