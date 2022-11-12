package com.relaxed.amazonaws.sdk.extensions.extensionsImpl;

import com.relaxed.amazonaws.sdk.extensions.provider.AbstractEC2;
import com.relaxed.amazonaws.sdk.extensions.provider.Extension;
import com.relaxed.amazonaws.sdk.extensions.provider.Service;

public class RelaxedEC2 implements Extension<RelaxedEC2> {

    @Override
    public <E extends Service<E>> RelaxedEC2 create(Service<E> resource) {
        return null;
    }

    @Override
    public <E extends Service<E>> RelaxedEC2 delete(Service<E> resource) {
        return null;
    }
}