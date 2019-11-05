package teme_nefăcute.JDBC_week14;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.util.List;

public class ProductDAOImpl implements ProductDao {

    public ProductDAOImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
    public List<Product> getAll() {
        return template.query("SELECT * FROM employee", new ProductMapper());
    }

    @Override
    public void insertProduct(Product product) {
        final String sql = "INSERT into PRODUCT (productCode, productName, productLine, productScale) values(:productCode,:productLine,:productScale,:productLine)";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("productCode", product.getProductCode())
                .addValue("productName", product.getProductName())
                .addValue("productScale", product.getProductScale())
                .addValue("productLine", product.getProductScale());
        template.update(sql, param, holder);
    }

    @Override
    public void updateProduct(Product product) {
        final String sql = "UPDATE PRODUCT SET productLine=:productLine, productScale=:productScale " +
                "WHERE productCode=:productCode";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("productCode", product.getProductCode())
                .addValue("productLine", product.getProductLine())
                .addValue("productScale", product.getProductScale())
                .addValue("productLine", product.getProductLine());
        template.update(sql, param, holder);

    }
}
