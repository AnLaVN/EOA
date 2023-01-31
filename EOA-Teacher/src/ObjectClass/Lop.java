package ObjectClass;
//Make by Thành Đạt || Dat09

public class Lop {
    private Long IDLop;
    private Integer SoLuongSV = 0;
    private String Name;

    //Constructor
    public Lop(){}
    public Lop(Long IDLop, String Name, Integer SoLuongSV) {
        this.IDLop = IDLop;
        this.Name = Name;
        this.SoLuongSV = SoLuongSV;                 //add more
    }

    //Getter
    public Long    getIDLop()       {   return IDLop;       }
    public Integer getSoLuongSV()   {   return SoLuongSV;   }  
    public String  getName()        {   return Name;        }

    //Setter
    public void setIDLop(Long IDLop)            {   this.IDLop = IDLop;         }
    public void setSoLuongSV(Integer SoLuongSV) {   this.SoLuongSV = SoLuongSV; }
    public void setName (String Name)           {   this.Name = Name;           }
}