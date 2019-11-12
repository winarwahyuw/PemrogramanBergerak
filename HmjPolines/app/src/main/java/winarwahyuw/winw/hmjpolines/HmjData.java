package winarwahyuw.winw.hmjpolines;

import android.content.Intent;

import java.util.ArrayList;

public class HmjData {
    public static String[][]data=new String[][]{
            {"0","HMJ ELEKTRO", "Himpunan Mahasiswa Elektro terdiri dari 5 Program Studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi dan D4 Teknik Telekomunikasi","https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1","HMJ SIPIL", "Himpunan Mahasiswa Sipil terdiri dari 5 Program Studi yaitu D3 Konstruksi Sipil, D3 Konstruksi Gedung, D3 Perbaikan Jalan dan Jembatan, dan D4 Perbaikan dan Perawatan Gedung","https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2", "HMJ MESIN", "Himpunan Mahasiswa Mesin terdiri dari berbagi program studi","https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3","HMJ AKUNTANSI", "Himpunan Mahasiswa Akuntansi terdiri dari berbagai program studi","https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4","HMJ AB", "Himpunan Mahasiswa Administrasi Bisnis terdiri dari berbagai program studi","https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}
    };

    public static ArrayList<Hmj>getListData(){
        ArrayList<Hmj> list=new ArrayList<>();
        for(String[] aData: data){
            Hmj hmj=new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
