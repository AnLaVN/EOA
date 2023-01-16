package Controller;
// Make By Bình An || AnLaVN || KatoVN

import ObjectClass.BuoiThi;
import ObjectClass.CauHoi;
import ObjectClass.DeThi;
import ObjectClass.Lop;
import ObjectClass.Setting;
import ObjectClass.SinhVien;
import com.AnLa.FILE.*;
import com.AnLa.UI.Mode;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import javax.swing.*;

public class LocalData {
    public static final Setting LocalSetting = (Setting) ObjectData.readData("src/AppData/Setting.dat");            //create local setting from file
    public static boolean UIMode = LocalSetting.getMode();                      //contain values of current ui mode. true is dark, false is light
    public static Properties Lang = new Properties("src/AppData/Languages_"+LocalSetting.getLang()+".properties");  //get file properties contain languages
    public static final Color   BLUR = new Color(150, 150, 150, 150), 
                                BLIND = new Color(0,0,0,0),
                                SEN = new Color(105, 120, 135, 100),
                                PANANSWER = new java.awt.Color(90, 105, 120, 100),
                                HOVERANSWER = new java.awt.Color(141, 175, 206, 100),
                                CLICKANSWER = new java.awt.Color(25, 156, 118, 100);//some default color
    public static final Font CUSTOMFONT = new java.awt.Font("Tahoma", 0, 22);
    public static Component ParentComponent;
    public static final String CURRENTVERSION = "v2.7.56.8";      //create current version
    public static final String AVATAR = "FaceRecognition/Image/original.png";
    public static String CurrentID;
    public static SinhVien CurrentSV;
    public static Lop CurrentL;
    public static BuoiThi CurrentBT;
    public static DeThi CurrentDT;
    public static ArrayList<BuoiThi> arrBT = new ArrayList<>();
    public static ArrayList<CauHoi> arrCH = new ArrayList<>();
    
    private static URL url;
    private static BufferedReader br;
    
    public static void setLang(String languages)                {
        Lang.setProperties("src/AppData/Languages_"+languages+".properties");
    }
    public static void checkVersion() {
//  [This content has been censored by AnLaVN owner.]
    }
    public static void saveAvatar()                   {
        Log.add("Waiting for download Image from: " + CurrentSV.getAvatar());
        try ( InputStream in = new URL(CurrentSV.getAvatar()).openStream()) {
            Path path = Paths.get(AVATAR);
            Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){ Log.add("!!! Error try to download Image from Cloundinary. !!!");}
    }
}