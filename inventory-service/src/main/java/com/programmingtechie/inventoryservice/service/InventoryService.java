package com.programmingtechie.inventoryservice.service;

import org.springframework.transaction.annotation.Transactional;

public interface InventoryService {


    public boolean IsInStock(String skuCode);
}
