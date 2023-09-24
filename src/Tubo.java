public class Tubo {
    private float raggio;
    private float altezza;

    public Tubo (float raggio, float altezza) throws Exception{
        if (raggio <= 0 || altezza <= 0 ) {
            throw new Exception("Raggio o altezza non valido!");
        }
        this.raggio = raggio;
        this.altezza = altezza;
    }

    public float getRaggio() {
        return raggio;
    }

    public float getAltezza() {
        return altezza;
    }
}
