package com.nogueira.catalog.admin.application.category.create;

import com.nogueira.catalog.admin.application.UseCase;
import com.nogueira.catalog.admin.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
