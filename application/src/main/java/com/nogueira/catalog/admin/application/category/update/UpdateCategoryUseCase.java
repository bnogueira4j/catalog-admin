package com.nogueira.catalog.admin.application.category.update;

import com.nogueira.catalog.admin.application.UseCase;
import com.nogueira.catalog.admin.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
