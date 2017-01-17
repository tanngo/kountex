package org.apache.cordova.kountexample;


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
            this.ReturnText();
            return true;
        }
        return false;
    }
	public void ReturnText(String message, CallbackContext callbackContext)
	{
		 callbackContext.success("Ngo test");
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
