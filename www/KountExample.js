var exec = require('cordova/exec');

var KountExample = function (){
    var _appID = "AppIDNGO";
}
KountExample.prototype.coolMethod = function(arg0, success, error) {
    exec(success, error, "KountExample", "coolMethod", [arg0]);
};
KountExample.prototype.ReturnText = function()) {
    exec(null, null, "KountExample", "ReturnText",[]);
};
KountExample.prototype.getNextAppointment = function(success, error, args) {
    if (args.length == 0 || args[0] < 0) {
        // Invalid call to the plugin, so return an error condition
        error('Invalid value for minutes argument');
        return;
    }

    /**
        Code to retrieve name, time of next appointment goes here
    **/

    if (foundAppointment) {
        result = {
                'title': appointmentTitle,
                'date' : appointmentDate
                };
        success(result);
    } else {
        // Empty string to indicate no appointment
        success('');
    }
}

if(!window.plugins)
    window.plugins = {};

if (!window.plugins.KountExample)
    window.plugins.KountExample = new KountExample();

if (typeof module != 'undefined' && module.exports)
    module.exports = KountExample;

