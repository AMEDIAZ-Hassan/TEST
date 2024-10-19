class TestCercle
{
    /**
     * Programme principal testanr les fonctionnalités de la classe Cercle
     */
    public static void main(String[] args)
    {
        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle();
        Cercle c3 = new Cercle();

        c1.setCentre(1.0, 2.0);
        c1.setRayon(Math.sqrt(5.0)); // passe par (0, 0)
        c2.setCentre(-2.0, 1.0);
        c2.setRayon(2.25);  // 2.25 > sqrt(5) => inclus le point (0, 0)
        c3.setCentre(-2.0, -5.0);
        c3.setRayon(1.0);
        System.out.println("Surface de c1 : " +  c1.surface());
        System.out.println("Surface de c2 : " +  c2.surface());
        System.out.println("Surface de c3 : " +  c3.surface());

        afficherPosition("c1", c1, 0.0, 0.0);
        afficherPosition("c2", c2, 0.0, 0.0);
        afficherPosition("c3", c3, 0.0, 0.0);
    }
    /* Méthode utilitaire affichant si un point est en dehors ou en dedans
     * d'un cercle donné
     * @param c : le cercle
     * @param x, y: les coordonnées du point
     * @paramm nom : le nom donné au cercle pour l'affichage
     */
    static void afficherPosition(String nom, Cercle c, double x, double y)
    {
        System.out.print("Position du point (" + x + ", " + y + ") : ");

        if (c.estInterieur(x,y))
        {
            System.out.print("dans ");
        }
        else
        {
            System.out.print("hors de ");
        }
        System.out.println(nom);
    }

}
/* Classe Cercle
 */
