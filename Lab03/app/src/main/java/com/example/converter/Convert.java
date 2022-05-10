package com.example.converter;

public class Convert {
    public static double usdBDT(double usdB) {
        usdB = usdB * 80;
        return usdB;
    }

    public static double bdtUSD(double BDTu) {
        BDTu = BDTu / 80;
        return BDTu;
    }

    public static double bdtIND(double bdtI) {
        bdtI = bdtI * 78;
        return bdtI;
    }

    public static double MtF(double MF) {
        MF = MF * 5280;
        return MF;
    }

    public static double ItF(double IF) {
        IF = IF / 12;
        return IF;
    }

    public static double YtM(double YM) {
        YM = YM / 1760;
        return YM;
    }

    public static double KtP(double KP) {
        KP = KP * 2.2;
        return KP;
    }

    public static double PtO(double PO) {
        PO = PO * 16;
        return PO;
    }

    public static double KtG(double KG) {
        KG = KG * 1000;
        return KG;
    }

    public static double HtK(double HK) {
        HK = HK / 100;
        return HK;
    }

    public static double HtA(double HA) {
        HA = HA * 2.47;
        return HA;
    }

    public static double MtY(double MY) {
        MY = MY * 1.19;
        return MY;
    }

    public static double BtK(double BK) {
        BK = BK / 1000;
        return BK;
    }

    public static double MtK(double MK) {
        MK = MK * 1000;
        return MK;
    }

    public static double TtG(double TG) {
        TG = TG * 1000;
        return TG;
    }

    public static double DtM(double DM) {
        DM = DM * 1440;
        return DM;
    }

    public static double DtW(double DW) {
        DW = DW * 521;
        return DW;
    }

    public static double MtW(double MW) {
        MW = MW * 4.3;
        return MW;
    }
}
