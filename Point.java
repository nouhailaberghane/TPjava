public class Point extends Object {
    public int x;
    public int y;
    public Point(){this(0,0);}
    public Point(int a , int b){  x =a;  y=b;   }
    public Point(int a){ x=a; y=0;}
   
      
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
// deplce le point par x ey y 
    public void deplacer(int x1, int y1) {
        this.x += x1;
        this.y += y1;

    }
// metre le point au centre p(0,0)
    public void reset() {
        this.x = 0;
        this.y = 0;
    }
//retour la distence entre deux point
    public double distance(Point b) {
        return Math.sqrt(Math.pow((this.x - b.x), 2) + Math.pow((this.y - b.y), 2));
    }

    // version 2
    public double distance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    // copare deux objet
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        } else {
            Point p = (Point) o;
            return ((p.getX() == this.getX()) && (p.getY() == this.getY()));
        }

    }
  //compare deux point
    public boolean equals(Point o) {
        return ((this.x == o.getX() && (this.y == o.getY())));
    }
    // la methode tostring 
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
