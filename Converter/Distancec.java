package Converter;

public class Distancec {
    public float km_to_m(float km)
    {
        float m;
        m=km*1000;
        return(m);
    }
    public float km_to_cm(float km)
    {
        float cm;
        cm=km*100000;
        return(cm);
    }
    public float m_to_km(float m)
    {
        float km;
        km=m/1000;
        return(km);
    }
    public float m_to_cm(float m)
    {
        float cm;
        cm=m*100;
        return(cm);
    }
    public float cm_to_km(float cm)
    {
        float km;
        km=cm/100000;
        return(km);
    }
    public float cm_to_m(float cm)
    {
        float m;
        m=cm/100;
        return(m);
    }
}
