package behavioral.template_method.CD3;

public class SortProductByPrice extends SortCollection<Product> {
    @Override
    protected int myCompare(Product p1, Product p2) {
        // So sánh theo giá
        return Integer.compare(p1.getPrice(), p2.getPrice());
    }
}
