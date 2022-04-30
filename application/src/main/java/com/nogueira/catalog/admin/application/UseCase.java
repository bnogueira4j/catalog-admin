package com.nogueira.catalog.admin.application;

import com.nogueira.catalog.admin.domain.category.Category;

public class UseCase {
    public Category execute() {
        return Category.newCategory();
    }
}