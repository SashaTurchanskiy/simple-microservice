package com.programmingtechie.inventoryservice.controller;

import com.programmingtechie.inventoryservice.model.Inventory;
import com.programmingtechie.inventoryservice.service.InventoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@AllArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean IsInStock(@PathVariable("sku-code")String skuCode){
        return inventoryService.IsInStock(skuCode);
    }
}
