import java.util.ArrayList;

public class Bag{
    private ArrayList<Item> items;
    private int limit;

    public Bag(){
        this.items = new ArrayList<Item> ();
        limit = 10;
    }
    public void addItem(String name){
        this.items.add(new Item(name));
    }
    public void showItem(){
        for(int i=0; i<items.size(); i++){
            items.get(i).show();
        }
    }
    
    
}