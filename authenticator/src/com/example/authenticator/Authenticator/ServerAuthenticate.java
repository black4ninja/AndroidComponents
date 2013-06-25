package com.example.authenticator.Authenticator;

/**
 * Created with IntelliJ IDEA.
 * User: Brounie
 * Date: 18/06/13
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ServerAuthenticate {
    public String userSignUp(final String name, final String email, final String pass, String authType) throws Exception;
    public String userSignIn(final String user, final String pass, String authType) throws Exception;
}
