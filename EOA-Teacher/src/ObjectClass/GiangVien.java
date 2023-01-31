package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import java.io.Serializable;

public class GiangVien implements Serializable{
    private String IDGiangVien, Name, Email, Avatar, Password;

    //Constructor
    public GiangVien() {}
    public GiangVien(String IDGiangVien, String Name, String Email, String Avatar, String Password) {
        this.IDGiangVien = IDGiangVien;
        this.Name = Name;
        this.Email = Email;
        this.Avatar = Avatar;
        this.Password = Password;
    }

    //Getter
    public String getIDGiangVien()  {   return IDGiangVien; }
    public String getName()         {   return Name;        }
    public String getEmail()        {   return Email;       }
    public String getAvatar()       {   return Avatar;      }
    public String getPassword()     {   return Password;    }

    //Setter
    public void setIDGiangVien(String IDGiangVien)  {   this.IDGiangVien = IDGiangVien; }
    public void setName       (String Name)         {   this.Name = Name;               }
    public void setEmail      (String Email)        {   this.Email = Email;             }
    public void setAvatar     (String Avatar)       {   this.Avatar = Avatar;           }
    public void setPassword   (String Password)     {   this.Password = Password;       }
    
}