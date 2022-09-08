package com.nogueira.catalog.admin.application.category.retrieve.list;

import com.nogueira.catalog.admin.application.UseCase;
import com.nogueira.catalog.admin.domain.category.CategorySearchQuery;
import com.nogueira.catalog.admin.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}