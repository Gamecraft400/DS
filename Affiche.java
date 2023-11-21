public class Affiche
{
    public static void main(String[] args) 
    {
        System.out.println("DS R5.07");
        //Affiche.affiche_ligne();
        //Affiche.affiche_ligne2(Integer.parseInt(args[0]));
        //Affiche.affiche_ligne3(args[0]);
        Affiche.affiche_ligne4(args[0])
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

    public static void affiche_ligne4(int nbEtoile)
    {
        int n = nbEtoile;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }





}
