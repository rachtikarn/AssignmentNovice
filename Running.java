import java.util.Scanner;
//import Novice.Thief;

public class Running{
    private Scanner input;
    int addjob;
    int state;
    int addItem;
    private boolean run;
    private String name;
    private Novice novice;
       
    public Running(){
        run = true;
        input = new Scanner(System.in);
    }
    public void run(){
        System.out.print("\nPlease your charector name : ");
        novice = new Novice(input.nextLine());
        System.out.print("\n");
        System.out.println("Please your job");
        System.out.println("1 >>> Swordman");
        System.out.println("2 >>> Thief");
        System.out.print("Prease enter : ");
        addjob = input.nextInt();
        if(addjob == 1){
            Swordman swordman = new Swordman("Swordman");
        }
        else if(addjob == 2){
            Thief thief = new Thief("Thief");
        }
        while(run){
            System.out.println("\nWhat do you want?");
            System.out.println("1 >>> Add Item");
            System.out.println("2 >>> Show Item");
            System.out.println("3 >>> Show info");
            System.out.println("0 >>> Exit");
            System.out.print("Prease enter : ");
            state = input.nextInt();
            System.out.print("\n");
            if(state == 1){
                System.out.println("List Item");
                System.out.println("1 >>> Hamberger");
                System.out.println("2 >>> Water");
                System.out.println("3 >>> Book");
                System.out.print("Prease enter : ");
                addItem = input.nextInt();
                if(addItem == 1){
                    novice.addItem("Hamberger");
                }
                else if(addItem == 2){
                    novice.addItem("Water");
                }
                else if(addItem == 3){
                    novice.addItem("Book");
                }
            }
            else if(state == 2){
                novice.showItems();
            }
            else if(state == 3){
                if(addjob == 1){
                    //Swordman swordman = new Swordman(name);
                    novice.swordmanHP(0);
                    novice.allEXP(0);
                    novice.allMANA(0);
                    novice.showInfo();
                }
                else if(addjob == 2){
                    novice.thiefHP(0);
                    novice.allEXP(0);
                    novice.allMANA(0);
                    novice.showInfo();
                }
            }
            else if(state == 0){
                run = false;
                System.out.println("Good bye, See you next time.");
            }
        }
    }
}
       
    