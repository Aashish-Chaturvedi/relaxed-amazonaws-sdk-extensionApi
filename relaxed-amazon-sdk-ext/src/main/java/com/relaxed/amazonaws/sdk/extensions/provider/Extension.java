package com.relaxed.amazonaws.sdk.extensions.provider;

public interface Extension<T> {
    public abstract <E extends Service<E>> T create(Service<E> resource);
    public abstract <E extends Service<E>> T delete(Service<E> resource);
}
