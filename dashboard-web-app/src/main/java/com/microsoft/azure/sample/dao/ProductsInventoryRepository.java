/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.sample.dao;

import com.microsoft.azure.sample.model.ProductsInventory;
import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;
import org.springframework.stereotype.Repository;

// import java.util.List;

@Repository
public interface ProductsInventoryRepository extends DocumentDbRepository<ProductsInventory, String> {
    // List<ProductsInventory> findByProductName(String productName);
}
