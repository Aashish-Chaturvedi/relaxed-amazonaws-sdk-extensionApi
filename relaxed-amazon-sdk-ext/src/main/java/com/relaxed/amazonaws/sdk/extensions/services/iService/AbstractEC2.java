package com.relaxed.amazonaws.sdk.extensions.service.iService;

import com.relaxed.amazonaws.sdk.extensions.credentials.RelaxedCredentials;
import com.relaxed.amazonaws.sdk.extensions.provider.Service;

public abstract class AbstractEC2 implements Service<AbstractEC2> {
   public abstract RelaxedCredentials getCredentials();

}
