package teme_nefăcute.JDBC_week14;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProductMapper  implements RowMapper<Product> {
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setProductCode(rs.getString("productCode"));
            product.setProductDescription(rs.getString("productDescription"));
            product.setProductLine(rs.getString("productLine"));
            product.setBuyPrice(rs.getDouble("buyPrice"));
            product.setMSRP(rs.getDouble("MSRP"));
            product.setProductName(rs.getString("productName"));
            product.setProductScale(rs.getString("productScale"));
            product.setProductVendor(rs.getString("productVendor"));
            product.setQuantityInStock(rs.getInt("quantityInStock"));
            return product;
        }
    }

