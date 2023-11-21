public class Affiche
{
    public static void main(String[] args) 
    {
        System.out.println("DS R5.07");
        //Affiche.affiche_ligne();
        //Affiche.affiche_ligne2(Integer.parseInt(args[0]));
        Affiche.affiche_ligne3(4);
    }


    public static void affiche_ligne()
    {
        System.out.println("*****");
    }

    public static void affiche_ligne2(int nbEtoile)
    {
        String s = ""; 

        for(int cpt = 0; cpt < nbEtoile; cpt++)
            s += "*";

        System.out.println(s);
    }

    public static void affiche_ligne3(int nbEtoile)
    {
        String s = ""; 

        for(int cpt = 0; cpt < nbEtoile; cpt++)
        {
            s += "x";
            System.out.println(s);
        }

        //System.out.println(s);
    }




}