package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

public class BaoCao {
    private String IDSinhVien, Name;
    private boolean Status = false;
    private Double Mark;
    private Integer LostFocus;

    //Constructor
    public BaoCao() {}
    public BaoCao(String IDSinhVien, String Name, boolean Status, Double Mark, Integer LostFocus) {
        this.IDSinhVien = IDSinhVien;
        this.Name = Name;
        this.Status = Status;
        this.Mark = Mark;
        this.LostFocus = LostFocus;
    }
    
    //Getter
    public String  getIDSinhVien()  {   return IDSinhVien;  }
    public String  getName()        {   return Name;        }
    public boolean getStatus()      {   return Status;      }
    public Double  getMark()        {   return Mark;        }
    public Integer getLostFocus()   {   return LostFocus;   }

    //Setter
    public void setIDSinhVien(String IDSinhVien){   this.IDSinhVien = IDSinhVien;   }
    public void setName      (String Name)      {   this.Name = Name;               }
    public void setStatus    (boolean Status)   {   this.Status = Status;           }
    public void setMark      (Double Mark)      {   this.Mark = Mark;               }
    public void setLostFocus (Integer LostFocus){   this.LostFocus = LostFocus;     }
    
}