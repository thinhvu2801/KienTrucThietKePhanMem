package behavioral.template_method.CD3;

import java.util.ArrayList;
import java.util.List;

public class MainSortCollection {
    public static void main(String[] args) {
        // 1. Tạo 1 SortCollection cụ thể:
        SortCollection<Product> sortByName = new SortProductByName();
        SortCollection<Product> sortProductByPrice = new SortProductByPrice();
        // 2. Tạo 1 ListProduct
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 1200, 5));
        productList.add(new Product("Smartphone", 800, 10));
        productList.add(new Product("Tablet", 500, 8));

        sortByName.sort(productList);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo tên:");
        for (Product product : productList) {
            System.out.println("Tên: " + product.getName() + ", Giá: " + product.getPrice());
        }

        sortProductByPrice.sort(productList);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá:");
        for (Product product : productList) {
            System.out.println("Tên: " + product.getName() + ", Giá: " + product.getPrice());
        }
    }
}
