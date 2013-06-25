package com.example.authenticator.Authenticator;

/**
 * Created with IntelliJ IDEA.
 * User: Brounie
 * Date: 18/06/13
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccountGeneral {

    /**
     * Account type id
     */
    public static final String ACCOUNT_TYPE = "com.udinic.auth_example";

    /**
     * Account name
     */
    public static final String ACCOUNT_NAME = "Udinic";

    /**
     * Auth token types
     */
    public static final String AUTHTOKEN_TYPE_READ_ONLY = "Read only";
    public static final String AUTHTOKEN_TYPE_READ_ONLY_LABEL = "Read only access to an Udinic account";

    public static final String AUTHTOKEN_TYPE_FULL_ACCESS = "Full access";
    public static final String AUTHTOKEN_TYPE_FULL_ACCESS_LABEL = "Full access to an Udinic account";

    public static final ServerAuthenticate sServerAuthenticate = new ParseComServerAuthenticate();
}
