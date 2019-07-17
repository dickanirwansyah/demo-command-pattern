package com.dicka.shoppingcart.util;

public interface Command<RESULT, REQUEST extends ServiceRequest> {

    RESULT execute(REQUEST request);
}
