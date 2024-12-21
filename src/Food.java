public abstract class Food implements Consumable {
 String name ;

 public Food(String name){this.name=name;}

    public boolean equals(Object arg0){
        if (!(arg0 instanceof Food)) return false;
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }

    public String toString(){return name;}
    public void setName(String name){this.name=name;}
    public String getName(){return name;}
}
