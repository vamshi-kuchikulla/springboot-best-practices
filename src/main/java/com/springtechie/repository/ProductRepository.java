package com.springtechie.repository;

import com.springtechie.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
   // Product findBySupplierCode(String supplierCode);
}
