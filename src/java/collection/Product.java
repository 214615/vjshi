package collection;

import org.testng.annotations.Test;

public class Product {
    private int id;
    private String name;
    private float price;
    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString(){
        return "商品编号：" + id + "，名称：" + name + "，价格：" + price;
    }
}
