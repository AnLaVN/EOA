package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

public class BaoCao {
    private String IDSinhVien;
    private Long IDBuoiThi, IDLop;
    private Double Mark;
    private Integer LostFocus;

    //Constructor
    public BaoCao() {}
    public BaoCao(Long IDBuoiThi, Long IDLop, String IDSinhVien, Double Mark, Integer LostFocus) {
        this.IDBuoiThi = IDBuoiThi;
        this.IDLop = IDLop;
        this.IDSinhVien = IDSinhVien;
        this.Mark = Mark;
        this.LostFocus = LostFocus;
    }
    
    //Getter
    public String  getIDSinhVien()  {   return IDSinhVien;  }
    public Long    getIDBuoiThi()   {   return IDBuoiThi;   }
    public Long    getIDLop()       {   return IDLop;       }
    public Double  getMark()        {   return Mark;        }
    public Integer getLostFocus()   {   return LostFocus;   }

    //Setter
    public void setIDSinhVien(String IDSinhVien){   this.IDSinhVien = IDSinhVien;   }
    public void setIDBuoiThi (Long IDBuoiThi)   {   this.IDBuoiThi = IDBuoiThi;     }
    public void setIDLop     (Long IDLop)       {   this.IDLop = IDLop;             }
    public void setMark      (Double Mark)      {   this.Mark = Mark;               }
    public void setLostFocus (Integer LostFocus){   this.LostFocus = LostFocus;     }
    
}