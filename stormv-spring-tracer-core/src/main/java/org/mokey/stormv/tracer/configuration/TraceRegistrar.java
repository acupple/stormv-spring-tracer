package org.mokey.stormv.tracer.configuration;

import org.mokey.stormv.tracer.annotations.EnableTrace;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.AdviceModeImportSelector;
import org.springframework.context.annotation.AutoProxyRegistrar;

/**
 * Created by Forest on 2015/12/15.
 */
public class TraceRegistrar extends AdviceModeImportSelector<EnableTrace> {
    @Override
    protected String[] selectImports(AdviceMode adviceMode) {
        switch (adviceMode) {
            case PROXY:
                return new String[]{AutoProxyRegistrar.class.getName(),
                        TraceLogManagerConfiguration.class.getName(),
                        SimpleTraceConfiguration.class.getName()};
            case ASPECTJ:
                throw new UnsupportedOperationException("Not support AspectJ");
            default:
                return null;
        }
    }

}
