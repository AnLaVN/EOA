package ObjectClass;
//Make by Thành Đạt || Dat09
//Edit by Bình An || AnLaVN || KatoVN

import java.util.Date;

public class BuoiThi {
    private Long IDBuoiThi, IDDeThi;
    private String Name, IDGiangVien;
    private Date Start; 
    private int Delay, Time;

    //Constructor
    public BuoiThi() {}
    public BuoiThi(Long IDBuoiThi, String Name, Long IDDeThi, String IDGiangVien, Date Start, int Time, int Delay){
        this.IDBuoiThi = IDBuoiThi;
        this.Name = Name;
        this.IDGiangVien = IDGiangVien;
        this.Start = Start;
        this.Delay = Delay;
        this.Time = Time;
        this.IDDeThi = IDDeThi;
    }

    //Getter
    public Long   getIDBuoiThi()    {   return IDBuoiThi;   }
    public String getName()         {   return Name;        }
    public String getIDGiangVien()  {   return IDGiangVien; }
    public Date   getStart()        {   return Start;       }
    public int    getDelay()        {   return Delay;       }
    public int    getTime()         {   return Time;        }
    public Long   getIDDeThi()      {   return IDDeThi;     }
    
    //Setter
    public void setIDBuoiThi  (Long IDBuoiThi)      {   this.IDBuoiThi = IDBuoiThi;     }
    public void setName       (String Name)         {   this.Name = Name;               }
    public void setIDGiangVien(String IDGiangVien)  {   this.IDGiangVien = IDGiangVien; }
    public void setStart      (Date Start)          {   this.Start = Start;             }
    public void setDelay      (int Delay)           {   this.Delay = Delay;             }
    public void setTime       (int Time)            {   this.Time = Time;               }
    public void setIDDeThi    (Long IDDeThi)        {   this.IDDeThi = IDDeThi;         }
    
}