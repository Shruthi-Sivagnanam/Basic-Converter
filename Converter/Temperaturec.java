package Converter;

public class Temperaturec {
    public float cel_to_fahr(float cel)
    {
        float fahr;
        fahr=(cel*(9/5))+32;
        return(fahr);
    }
    public float fahr_to_cel(float fahr)
    {
        float cel;
        cel=(float) ((fahr-32)*0.5555556);
        return(cel);
    }
}
