package com.relaxed.amazonaws.sdk.extensions.extensionsImpl;

import com.amazonaws.auth.AWSCredentials;
import com.relaxed.amazonaws.sdk.extensions.provider.RelaxedCredentials;

public class AssumeRoleRelaxedCredentials extends RelaxedCredentials {

    private AssumeRoleRelaxedCredentials(Builder builder) {
        super(builder);
    }

    public static class Builder extends RelaxedCredentials.Builder<Builder> {

        @Override
        public Builder self() {
            return this;
        }

        @Override
        public AssumeRoleRelaxedCredentials build() {
            return new AssumeRoleRelaxedCredentials(this);
        }
    }
}
