class Square
{
    private int side;

    public void setSidee(int s){
        this.side = s;
    }

    public int getArea(){
        return this.side*this.side;
    }
}

class Main
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int side = 5;
        Square sq = new Square();
        sq.setSidee(side);
        System.out.println(sq.getArea());
    }
}