package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

public class DeThi {
    private Long IDDeThi;
    private Integer Total = 0, PercentA = 0, PercentB = 0,PercentC = 0,PercentD = 0, PercentT = 0;
    private String Name, IDGiangVien;

    //Constructor
    public DeThi() {}
    public DeThi(Long IDDeThi, Integer Total, String Name, String IDGiangVien) {
        this.IDDeThi = IDDeThi;
        this.Total = Total;
        this.Name = Name;
        this.IDGiangVien = IDGiangVien;
    }

    //Getter
    public Long    getIDDeThi()     {   return IDDeThi;     }
    public Integer getTotal()       {   return Total;       }
    public Integer getPercentA()    {   return PercentA;    }
    public Integer getPercentB()    {   return PercentB;    }
    public Integer getPercentC()    {   return PercentC;    }
    public Integer getPercentD()    {   return PercentD;    }
    public Integer getPercentT()    {   return PercentT;    }
    public String  getName()        {   return Name;        }
    public String  getIDGiangVien() {   return IDGiangVien; }

    //Setter
    public void setIDDeThi    (Long IDDeThi)        {   this.IDDeThi = IDDeThi;         }
    public void setTotal      (Integer Total)       {   this.Total = Total;             }
    public void setPercentA   (Integer PercentA)    {   this.PercentA = PercentA;       }
    public void setPercentB   (Integer PercentB)    {   this.PercentB = PercentB;       }
    public void setPercentC   (Integer PercentC)    {   this.PercentC = PercentC;       }
    public void setPercentD   (Integer PercentD)    {   this.PercentD = PercentD;       }
    public void setPercentT   (Integer PercentT)    {   this.PercentT = PercentT;       }
    public void setName       (String Name)         {   this.Name = Name;               }
    public void setIDGiangVien(String IDGiangVien)  {   this.IDGiangVien = IDGiangVien; }
}