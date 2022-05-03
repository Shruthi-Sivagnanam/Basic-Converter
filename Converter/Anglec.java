package Converter;

public class Anglec {
    public float radian_to_degree(float radian)
    {
        float degree;
        degree=(float) Math.toDegrees(radian);
        return(degree);
    }
    public float degree_to_radian(float degree)
    {
        float radian;
        radian=(float) Math.toRadians(degree);
        return(radian);
    }
}
