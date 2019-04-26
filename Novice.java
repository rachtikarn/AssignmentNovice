
public class Novice{
    private String name;
    private String job;
    private int exp;
    private int hp;
    private int mana;
    private int count;
    private Bag bag;

    public Novice (String name,String job){
        this.name=name;
        this.job=job;
        this.count=0;
        if(job.equals("Swordman")) {
            this.hp=3000;
            this.mana=500;
        }else {
        	  this.hp=1500;
              this.mana=2500;
        }
        this.exp=0;
        this.bag = new Bag();
        bag.addItem("Hamberger");
        bag.addItem("Water");
        bag.addItem("Book");
    }
    public void increaseEXP(int value){
       exp = exp+ value;
    }
    public void increaseHP(int value){
        hp = hp + value;
    }
    public void decreaseHP(int value){
        hp = hp - value;
    }
    public void increaseMANA(int value){
        mana = mana + value;
    }
    public void decreaseMANA(int value){
        mana = mana - value;
    }
    public void increaseCount() {
    	this.count = this.count+1;
    }
    public int useItem(String nameItem) {
    	return bag.useItem(nameItem);
    }
    public void showInfo(){
        System.out.println("------------------");
        System.out.println("Name : "+this.name);
        System.out.println("EXP : "+this.exp);
        System.out.println("HP : "+this.hp);
        System.out.println("Mana : "+this.mana);
        System.out.println("------------------");
    }
    public String getName() {
    	return this.name;
    }
    public String getJob() {
    	return this.job;
    }
    public int getHp() {
    	return hp;
    }
    public int getExp() {
    	return exp;
    }
    public int getMana() {
    	return mana;
    }
    public int getCount() {
    	return count;
    }
}
