package org.apache.cordova.kountexample;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CordovaWebView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Locale;
import android.widget.Toast;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
/**
 * This class echoes a string called from JavaScript.
 */
public class KountExample extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        } else  if (action.equals("ReturnText")) {
            this.ReturnText("ngo test return text", callbackContext);
            return true;
        }
        return false;
    }
	public void ReturnText(String message, CallbackContext callbackContext)
	{
         Toast toast=Toast.makeText(this, "hien thi tu toast",   Toast.LENGTH_LONG);
         toast.show();
		 callbackContext.success(message);
	}
    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
    private void getNextAppointment(int minutes, CallbackContext callbackContext) {
        if (minutes > 0) {

            callbackContext.success("success in call getNextAppointment");

        } else {
            callbackContext.error("minutes must be > 0");
        }
    }
}
