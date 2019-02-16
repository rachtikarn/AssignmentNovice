
public class Novice{
    private String name;
    private int exp;
    private int hp;
    private int mana;
    private Bag bag;
    //private Item item;
  

    public Novice (String name){
        this.name=name;
        this.exp=0;
        this.hp=1000;
        this.mana=300;
        this.bag = new Bag();
    }
    public void increaseEXP(int exp){
        this.exp =+ exp;
    }
    public void increaseHP(int heal){
        hp = hp + heal;
    }
    public void decreaseHP(int damage){
        hp = hp - damage;
    }
    public void increaseMANA(int reset){
        mana = mana + reset;
    }
    public void decreaseMANA(int power){
        mana = mana - power;
    }
    public void showInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("EXP : "+this.exp);
        System.out.println("HP : "+this.hp);
        System.out.println("Mana : "+this.mana);
        System.out.println("------------------");
    }
    public void addItem(String itemName){
        this.bag.addItem(itemName);
    }
    public void showItems(){
        this.bag.showItem();
    }

}