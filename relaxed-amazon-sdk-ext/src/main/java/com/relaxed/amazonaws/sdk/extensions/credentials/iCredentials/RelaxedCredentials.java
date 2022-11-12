package com.relaxed.amazonaws.sdk.extensions.credentials;

public abstract class RelaxedCredentials {
    private String region;
    private String sessionId;

    public String getRegion() {
        return this.region;
    }
    public String getSessionId() {
        return this.sessionId;
    }
    
    public abstract static class Builder<T extends Builder<T>> {
        private String region;
        private String sessionId;

        public T setRegion(String region){
            this.region = region;
            return self();
        }
        public T setSessionId(String sessionId){
            this.sessionId = sessionId;
            return self();
        }

        public abstract T self();
        public abstract RelaxedCredentials build();
    }

    protected RelaxedCredentials(Builder<?> builder) {
        this.region = builder.region;
        this.sessionId = builder.sessionId;
    }
}
