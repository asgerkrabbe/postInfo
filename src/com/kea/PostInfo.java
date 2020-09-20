package com.kea;

public class PostInfo {
    int Postnummer;
    String ByNavn;

    public PostInfo(int Postnummer, String Bynavn )
    {
        this.Postnummer= Postnummer;
        this.ByNavn= Bynavn;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString(){
        return "Postnummer: "+Postnummer+ " ByNavn: "+ByNavn;
    }

}
