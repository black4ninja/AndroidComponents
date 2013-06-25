package com.example.authenticator.Authenticator;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.example.authenticator.Authenticator.Authenticator;

/**
 * Created with IntelliJ IDEA.
 * User: Brounie
 * Date: 18/06/13
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class AuthenticatorService extends Service {
    @Override
    public IBinder onBind(Intent intent) {

        Authenticator authenticator = new Authenticator(this);
        return authenticator.getIBinder();
    }
}