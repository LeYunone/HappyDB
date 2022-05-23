package xyz.leyuna.happydb.core.autoconfigure.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author LeYuna
 * @email 365627310@qq.com
 * @date 2022-05-23
 */
@Aspect
@Component
public class ListenAfterAOP {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 设置监听后方法的切点
     */
    @Pointcut("@annotation(xyz.leyuna.happydb.core.autoconfigure.TheHappyDB)")
    public void logListenPoint(){};

    @After("logListenPoint()")
    public void logListenInfo(ProceedingJoinPoint joinPoint){
        logger.info("监听完成");
    }
}
