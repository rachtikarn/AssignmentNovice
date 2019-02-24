import java.util.ArrayList;

public class Bag{
    private ArrayList<Item> items;
    private int limit;

    public Bag(){
        this.items = new ArrayList<Item> ();
        limit = 10;
    }
    public void addItem(String name){
        if(name.equals("Hamberger")){
            this.items.add(new Hamberger(name));
        }
        else if(name.equals("Water")){
            this.items.add(new Water(name));
        }
        else if(name.equals("Book")){
            this.items.add(new Book(name));
        }
    }
    public void showItem(){
        System.out.println("------------------");
        for(int i=0; i<items.size(); i++){
            items.get(i).show();
        }
        System.out.println("------------------");
    }
    
    
}