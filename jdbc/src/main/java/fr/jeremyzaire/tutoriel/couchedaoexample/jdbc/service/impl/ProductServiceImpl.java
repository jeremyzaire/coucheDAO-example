package fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service.impl;

import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.model.Product;
import fr.jeremyzaire.tutoriel.couchedaoexample.jdbc.service.ProductService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private Connection conn;

    public ProductServiceImpl() {
        try {
            initConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initConnection() throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:32790/postgres", "postgres", "password");
    }


    public List<Product> getProducts()  {
        List<Product> result = new ArrayList<>();
        String request = "Select * from Product";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = conn.prepareStatement(request);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("content");

                Product obj = new Product();
                obj.setId(id);
                obj.setContent(name);

                result.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        result.forEach(x -> System.out.println(x));

        return result;
    }

    @Override
    public void getOneProduct() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void updateProduct() {

    }
}
