package com.dicka.shoppingcart.util;

public interface ServiceExecutor {

    <T, R extends ServiceRequest> T execute(Class<? extends Command<T, R>> commandClass, R request);
}
