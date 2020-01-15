package lambda;

import lombok.Data;

/**
 * 简述：
 *
 * @author WangLipeng 1243027794@qq.com
 * @version 1.0
 * @since 2020/1/15 9:56
 */
class Product {
    private String color;
    private Integer price;

    Product(String color, Integer price) {
        this.color = color;
        this.price = price;
    }

    public Product() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
