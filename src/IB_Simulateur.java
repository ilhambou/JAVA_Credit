import Metier.IB_CreditMetier;
import dao.IB_CreditDao;
import presentation.IB_CreditControleur;

import java.util.Scanner;

public class IB_Simulateur {

        static Scanner clavier = new Scanner(System.in);
        private static boolean estUnNombre(String input)
        {
            try
            {
                Integer.parseInt(input);
                return true;
            }catch (Exception e)
            {
                return false;
            }
        }

        public static void test1()
        {
            IB_CreditDao dao = new IB_CreditDao();
            IB_CreditMetier metier = new IB_CreditMetier();
            IB_CreditControleur controleur = new IB_CreditControleur();

            metier.setIb_creditDao(dao);
            controleur.setCreditMetier(metier);
            String rep = "";
            do{
                System.out.println("=>[Test 1] Calcule de mensualite ");
                try {
                    String input = "";
                    while (true)
                    {
                        System.out.print("entrer l 'id : ");
                        input = clavier.nextLine();
                        if(estUnNombre(input))
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("entrerr non valide");
                        }
                    }
                    Long id = Long.parseLong(input);
                    controleur.afficher_mensualite(id);
                }catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                System.out.println("voulez vous quitter : ");
                rep = clavier.nextLine();
            }while (!rep.equalsIgnoreCase("oui"));
            System.out.println("bye");


        }

    public static void main(String[] args) {
        test1();
    }

    }
