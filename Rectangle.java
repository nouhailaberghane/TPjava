public class Rectangle {
    private Point hg;
    private Point bd;
    public Rectangle(){ };

    public Rectangle(Point h , Point d){
        hg = h ;
        bd = d;
    }
    public  void afficher(){
        System.out.println("haut a gauche :"+hg.toString());
        System.out.println("bas a droit   :"+bd.toString());
    }
    public double surface(){
     Point bg = new Point(hg.x,bd.y);

      return (bg.distance(hg) * bg.distance(bd));
    }
    public void zoom(int deltax , int deltay){ 
     this.bd.x=deltax;
     this.bd.y=deltay;
    }

   
}
