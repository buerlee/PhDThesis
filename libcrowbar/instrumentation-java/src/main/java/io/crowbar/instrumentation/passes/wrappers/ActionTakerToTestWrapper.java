package io.crowbar.instrumentation.passes.wrappers;

import io.crowbar.diagnostic.spectrum.Node;
import io.crowbar.instrumentation.passes.matchers.ActionTaker;

import javassist.CtClass;
import javassist.CtMethod;


public final class ActionTakerToTestWrapper implements TestWrapper {
    private final ActionTaker actionTaker;

    public ActionTakerToTestWrapper (ActionTaker actionTaker) {
        this.actionTaker = actionTaker;
    }

    @Override
    public Action getAction (CtClass c) {
        return actionTaker.getAction(c);
    }

    @Override
    public Action getAction (CtClass c,
                             CtMethod m) {
        return actionTaker.getAction(c, m);
    }

    @Override
    public String getOracleCode (CtClass c,
                                 CtMethod m,
                                 Node n,
                                 int probeId,
                                 String collectorVar,
                                 String exceptionVar) {
        return null;
    }

    @Override
    public String getOracleCode (CtClass c,
                                 CtMethod m,
                                 Node n,
                                 int probeId,
                                 String collectorVar) {
        return null;
    }
}