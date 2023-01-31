package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

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

}