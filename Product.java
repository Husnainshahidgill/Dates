class Product{
    private String name;
    private String type;
    private double price;
    private int id;
    private Date mfc;
    static int counter = 1;

    public Date getMfc() {
        return mfc;
    }

    public void setMfc(Date mfc) {
        this.mfc = mfc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    Product(String name,String type, double price,Date mfc){
        this.id = counter ++;
        this.name = name;
        this.type = type;
        this.price = price;
        this.mfc = mfc;
    }

    public String toString(){
        String output= String.format("%d| %s | %s | %.2f | %s ",id,name,type,price,mfc.addDate());
        return output;
    }
    public Product latestProd(Product p1, Product p2){
        //Date latest = mfc.recentDate(p1.mfc, p2.mfc);
        Date temp = mfc.recentDate(p1.mfc,p2.mfc);
        //if (p1.mfc > p2.mfc) {
        if (temp == p1.mfc){
            return p1;
        } else {
            return p2;

        }
    }
}
