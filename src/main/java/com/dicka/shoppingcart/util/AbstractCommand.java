package com.dicka.shoppingcart.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

public abstract class AbstractCommand<RESULT, REQUEST extends ServiceRequest>
 implements Command<RESULT, REQUEST>, ApplicationContextAware, InitializingBean {

    protected Validator validator;

    protected ApplicationContext applicationContext;


    @Override
    public final void setApplicationContext(ApplicationContext context) throws BeansException {
        this.applicationContext = context;
    }

    @Override
    public final void afterPropertiesSet() throws Exception{
        this.validator = applicationContext.getBean(Validator.class);
    }


    @Override
    public final RESULT execute(REQUEST request){

        Set<ConstraintViolation<REQUEST>>
                constraintViolations = validator.validate(request);

        if (constraintViolations.isEmpty()){
            return doExecute(request);
        }else{
            return (RESULT) new CommandValidationException(constraintViolations);

        }
    }


    public abstract RESULT doExecute(REQUEST request);

}

