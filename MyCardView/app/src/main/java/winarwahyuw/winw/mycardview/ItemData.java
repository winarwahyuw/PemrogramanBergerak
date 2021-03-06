package winarwahyuw.winw.mycardview;

import java.util.ArrayList;
import java.util.Collection;

public class ItemData {
    private static int[] idCard={
            0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9
    };
    private static int[] itemImages={
            R.drawable.iconbt21,
            R.drawable.in_van,
            R.drawable.in_chimmy,
            R.drawable.in_cooky,
            R.drawable.in_koya,
            R.drawable.in_mang,
            R.drawable.in_rj,
            R.drawable.in_shooky,
            R.drawable.in_tata,
            R.drawable.bts
    };

    private static String[] itemNames={
            "BT21 by BTS",
            "Van by BTS",
            "Chimmy by Jimin",
            "Cooky by Jungkook",
            "Koya by Rap Monster",
            "Mang by JHope",
            "RJ by Jin",
            "Shooky by Suga",
            "Tata by Taehyung",
            "About BTS"
    };

    private static String[] itemDetails={
            "Character made by BTS",
            "Guardian space robot",
            "Innocent, \"work hard, play hard\"",
            "Unexpectedly muscular, heart buttocks",
            "Smart sleepyhead",
            "Smart sleepyhead",
            "Mystery dancer",
            "Kind, loving, foodie",
            "Mini prankster",
            "Off-the-wall, curious soul, prince",
            "Go-International BoyGrou, BT21 Creator"
    };

    private static int[] CardViewImages={
            R.drawable.bt21_group,
            R.drawable.a_van,
            R.drawable.a_chimmy,
            R.drawable.a_cooky,
            R.drawable.a_koya,
            R.drawable.a_mang,
            R.drawable.a_rj,
            R.drawable.a_shooky,
            R.drawable.a_tata,
            R.drawable.bts2
    };
//
    private static String[] CardViewDetail={
            "BT21 Character created by BTS that have an amazing personality each Character. They are Van who a vehicle, Chimmy, Cooky, Mang, Koya, RJ, Tata, and Shooky ",
            "VAN who seems to know everything about the world, protects BT21 24/7. #guardian #vehicle #transformation #robot",
            "CHIMMY enjoys wearing a yellow hoodie, and is born with a passion to work hard on everything, no matter what. #passion #workhard #playhard #harmonica #yellowhoodie",
            "COOKY hopes to break out of the stereotypes from the cherubic appearance, and become tough. #unbalanced #eyebrows #heartbutt #imaginarymuscles",
            "Exceptionally bright and talented KOYA. Sleeping cutie full of thoughts and thoughts of sleeping. #talented #pillow #droopyeyes #removableears",
            "When dancing, MANG is cooler than ever. Veiled under mask, MANG's true identity remains a secret. #Heartshapednose #mask #mystery #BestDancer",
            "RJ loves to both cook and eat. RJ's fluffy fur and warm heart makes everyone feel they're at home. #greetings #gentlesoul #parka #omnomnom",
            "Tiny SHOOKY loves jokes, especially ones on friends. Milk is what SHOOKY hates the most. #fun #manyfaces #mini #CrunchySquad",
            "Prince TATA from planet BT, has a super stretchy body as well as super natural powers. #PlanetBT #offthewall #superpowers #Prince",
            "BTS from Bighit, a boygroup who have so much fans over the world. They collaborated with LINE to create BT21, Character that used in LINE. They are Rap Monster, Jimin, Jungkook, Jhope, Jin, Suga, and Taehyung"
    };

    static ArrayList<DataSet> getListData() {
        ArrayList<DataSet> list = new ArrayList<>();
        for (int i = 0; i < itemNames.length; i++) {
            DataSet data = new DataSet();
            data.setId(idCard[i]);
            data.setPhoto(itemImages[i]);
            data.setName(itemNames[i]);
            data.setDetail(itemDetails[i]);
            data.setCardImages(CardViewImages[i]);
            data.setCardDetail(CardViewDetail[i]);

            list.add(data);

        }

        return list;
    }

//    static ArrayList<DataSet> getListDetailData(){
//        ArrayList<DataSet> list2=new ArrayList<>();
//        for(int a=0; a<itemNames.length; a++){
//            DataSet data2=new DataSet();
//            data2.setCardImages(CardViewImages[a]);
//            list2.add(data2);
//        }
//        return list2;
//    }


}
