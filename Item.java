
public class Item{
    private String name;
    private int exp;
    private int hp;
    private int mana;

    public Item (String name){
        this.name=name;
        if(this.name.equals("Hamberger")){
            this.exp =  0;
            this.hp = 200;
            this.mana = 0; 
        }
        else if(this.name.equals("Water")){
            this.exp = 0;
            this.hp = 0;
            this.mana = 100; 
        }
        else if(this.name.equals("Book")){
            this.exp = 300;
            this.hp = 0;
            this.mana = 0; 
        }
    }
    public void show(){
        System.out.println("Name : "+this.name);
        System.out.println("EXP : "+this.exp);
        System.out.println("HP : "+this.hp);
        System.out.println("Mana : "+this.mana);
        System.out.print("\n");
    }

}