import java.util.Scanner;    

    public class Running{
        private Scanner input;
        int state;
        int addItem;
        private boolean run;

    public Running(){
        run = true;
        input = new Scanner(System.in);
    }
    public void run(){
        System.out.print("\nPlease your charector name : ");
        Novice novice = new Novice(input.nextLine());
        while(run){
            System.out.println("\nWhat do you want?");
            System.out.println("1 >>> Add Item");
            System.out.println("2 >>> Show Item");
            System.out.println("3 >>> Show info");
            //System.out.println("4 >>> Use Item");
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
                novice.showInfo();
            }
            /*else if(state == 4){
                
            }*/
            else if(state == 0){
                run = false;
                System.out.println("Good bye, See you next time.");
            }
        }
    }
    }