package com.relaxed.amazonaws.sdk.extensions;

import com.relaxed.amazonaws.sdk.extensions.extensionsImpl.AssumeRoleRelaxedCredentials;
import com.relaxed.amazonaws.sdk.extensions.extensionsImpl.RelaxedEC2;
import com.relaxed.amazonaws.sdk.extensions.provider.AbstractEC2;
import com.relaxed.amazonaws.sdk.extensions.provider.Extension;
import com.relaxed.amazonaws.sdk.extensions.provider.RelaxedCredentials;
import com.relaxed.amazonaws.sdk.extensions.provider.Service;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       RelaxedCredentials t =  new AssumeRoleRelaxedCredentials.Builder().setRegion("Ashish").build();
       System.out.println(t.getRegion());
       
       Service<AbstractEC2> ec2 = new AbstractEC2() {

        @Override
        public RelaxedCredentials getCredentials() {
            // TODO Auto-generated method stub
            return t;
        }
       };

       RelaxedEC2 ec = new RelaxedEC2().create(ec2);
       
    }
}
