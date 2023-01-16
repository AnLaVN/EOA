package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import static Controller.CloudData.Cloudinary;
import static Controller.LocalData.AVATAR;
import com.AnLa.FILE.Log;


public class SinhVien {
    private String IDSinhVien, Name, Avatar;
    private Long IDLop;
    private Boolean Status;

    //Constructor
    public SinhVien() {}
    public SinhVien(String IDSinhVien, String Name, String Avatar, Boolean Status, Long IDLop) {
        this.IDSinhVien = IDSinhVien;
        this.Name = Name;
        this.Avatar = Avatar;
        this.Status = Status;
        this.IDLop = IDLop;
    }

    //Getter
    public String  getIDSinhVien()  {   return IDSinhVien;  }
    public String  getName()        {   return Name;        }
    public String  getAvatar()      {   return Avatar;      }
    public Boolean getStatus()      {   return Status;      }
    public Long    getIDLop()       {   return IDLop;       }

    //Setter
    public void setIDSinhVien(String IDSinhVien){   this.IDSinhVien = IDSinhVien;   }
    public void setName      (String Name)      {   this.Name = Name;               }
    public void setAvatar    (String Avatar)    {   this.Avatar = Avatar;           }
    public void setStatus    (Boolean Status)   {   this.Status = Status;           }
    public void setIDLop     (Long IDLop)       {   this.IDLop = IDLop;             }

    //set Image fot face regconition
    public void setImage(String filePath){
        if(Avatar != null && Avatar.startsWith("http://res.cloudinary.com")){
            Log.add("Delete Image from Cloudinary: "+Avatar);
            Cloudinary.FileDeleteByURL(Avatar);
        }
        if(filePath != null && !filePath.equals("")){
            Log.add("Upload Image from: " + filePath);
            this.Avatar = Cloudinary.FileUpload(filePath, "EOA/ImageStudent/");
        }
    }
    
}