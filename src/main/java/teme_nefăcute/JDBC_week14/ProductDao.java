package teme_nefăcute.JDBC_week14;

import java.util.List;

public interface ProductDao {

    public List<Product> getAll();
    public void insertProduct(Product product);
    public void updateProduct(Product product);
}
