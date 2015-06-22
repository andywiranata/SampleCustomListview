package com.nostratech.samplecustomlistview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nostra on 6/22/15.
 */
public  class DummyData {
    public static List<Profile> dumyData = new ArrayList<Profile>();
    static{
        Profile profile=new Profile();
        profile.name="andy wira";
        profile.address="Jl. Bona";
        profile.email="andy@nostratech.com";
        dumyData.add(profile);
        profile=new Profile();
        profile.name="andy002";
        profile.address="Jl. Bona 002";
        profile.email="andy@nostratech.com";
        dumyData.add(profile);
        profile=new Profile();
        profile.name="andy wira 003";
        profile.address="Jl. Bona 003";
        profile.email="andy@nostratech.com";
        dumyData.add(profile);
        profile=new Profile();
        profile.name="andy wira 004";
        profile.address="Jl. Bona 004";
        profile.email="andy@nostratech.com";
        dumyData.add(profile);
        profile=new Profile();
        profile.name="andy wira 005";
        profile.address="Jl. Bona 005";
        profile.email="andy@nostratech.com";
        dumyData.add(profile);



    }



}
