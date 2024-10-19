
public class Cercle {
    private double rayon;
    private double x;  // abscisse du centre
    private double y;  // ordonnée du centre
    public void setCentre(double unX, double unY) {
        x = unX;
        y = unY;
    }
    public void setRayon(double r) {
        if (r < 0.0) r = 0.0;
        rayon = r;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return rayon;
    }

    public double getX() {
        return x;
    }

    // calcul de la surface du cercle
    public double surface() { return Math.PI * rayon * rayon; }
    /* méthode testant la position d'un point par rapport au cercle
     * @return : true si le point de coordonnées unX et unY est
     *  dans le cercle
     */

     public boolean estInterieur(double unX, double unY) {
        return (((unX-x) * (unX-x) +
                 (unY-y) * (unY-y))
                <= rayon * rayon);
    }


}
