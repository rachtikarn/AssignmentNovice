
public class Novice{
    private String name;
    protected int exp;
    protected int hp;
    protected int mana;
    private Bag bag;

    public Novice (String name){
        this.name=name;
        this.exp=exp;
        this.hp=hp;
        this.mana=mana;
        this.bag = new Bag();
    }
    /*public Novice (String name, int exp, int hp, int mana){
        this.name=name;
        this.exp=exp;
        this.hp=hp;
        this.mana=mana;
    }*/
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
        System.out.println("------------------");
        System.out.println("Name : "+this.name);
        System.out.println("EXP : "+this.exp);
        System.out.println("HP : "+this.hp);
        System.out.println("Mana : "+this.mana);
        System.out.println("------------------");
    }
    public int swordmanHP(int heal){
        return hp = 2000;
    }
    public int allEXP(int exp){
        return exp = 0;
    }
    public int allMANA(int reset){
        return mana = 300;
    }
    public int thiefHP(int heal){
        return hp = 500;
    }
    public void addItem(String itemName){
        this.bag.addItem(itemName);
    }
    public void showItems(){
        this.bag.showItem();
    }

}

class Thief extends Novice{

    public Thief(String name){
        super(name);
    }
    /*public Thief(String name,int exp, int hp, int mana){
        super(name, 0, 500, 300);
    }*/
}

class Swordman extends Novice{

    public Swordman(String name){
        super(name);
    }
    /*public Swordman(String name, int exp, int hp, int mana){
        super(name, 0, 2000, 300);
    }*/
}
