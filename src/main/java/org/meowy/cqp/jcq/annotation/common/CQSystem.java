package org.meowy.cqp.jcq.annotation.common;

import org.meowy.cqp.jcq.annotation.CQEventMapping;
import org.meowy.cqp.jcq.entity.ISystem;

import java.lang.annotation.*;

/**
 * Created by Sobte on 2018/8/7.<br>
 * Time: 2018/8/7 20:31<br>
 * Email: i@sobte.me<br>
 *
 * @author Sobte
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@CQEventMapping(fromQQ = ISystem.System_QQID_Application)
public @interface CQSystem {



}
