package behavioral.template_method.CD3;



public class SortProductByName extends SortCollection<Product> {

    @Override
    protected int myCompare(Product p1, Product p2) {
        // So sánh theo tên
        return p1.getName().compareTo(p2.getName());
    }
}
