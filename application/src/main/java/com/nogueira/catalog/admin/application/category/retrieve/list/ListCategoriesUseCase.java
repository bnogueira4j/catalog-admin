package com.nogueira.catalog.admin.application.category.retrieve.list;

import com.nogueira.catalog.admin.application.UseCase;
import com.nogueira.catalog.admin.domain.pagination.Pagination;
import com.nogueira.catalog.admin.domain.pagination.SearchQuery;

public abstract class ListCategoriesUseCase
        extends UseCase<SearchQuery, Pagination<CategoryListOutput>> {
}