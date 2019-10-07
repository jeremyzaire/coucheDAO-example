package mybatis.service.impl;

import mybatis.mappers.ProductMapper;
import mybatis.model.Product;
import mybatis.service.ProductService;
import mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class ProductServiceImpl implements ProductService {

    @Override
    public void getAllProducts() {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println("All products = " + productMapper.getAllProducts());
            System.out.println("---------------------------------------------------");
            sqlSession.commit();
        }
    }

    @Override
    public void getProductById(Integer id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            ProductMapper userMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println("Product : " + userMapper.getProductById(id).toString());
            System.out.println("---------------------------------------------------");
        }
    }

    @Override
    public void insertProduct(Product product) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            productMapper.insertProduct(product);
            sqlSession.commit();
            System.out.println("Product " + product + " inserted");
            System.out.println("---------------------------------------------------");
        }
    }

    @Override
    public void deleteProduct(Integer id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            productMapper.deleteProduct(id);
            sqlSession.commit();
            System.out.println("Product " + id + " deleted");
            System.out.println("---------------------------------------------------");
        }
    }

    @Override
    public void updateProduct(Product product) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession()) {
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            productMapper.updateProduct(product);
            System.out.println("Product : " + product + " updated !");
            System.out.println("---------------------------------------------------");
            sqlSession.commit();
        }
    }
}
