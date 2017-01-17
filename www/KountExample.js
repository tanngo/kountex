
var KountExample = function (){
    var _appID = "AppIDNGO";
}
KountExample.prototype.coolMethod = function(arg0, success, error) {
     cordova.exec(success, error, "KountExample", "coolMethod", [arg0]);
};
KountExample.prototype.ReturnText = function(arg0, success, error) {
     cordova.exec(function(){}, function(){}, "KountExample", "ReturnText",[arg0]);
};
KountExample.prototype.getNextAppointment = function(success, error, args) {
    if (args.length == 0 || args[0] < 0) {
        // Invalid call to the plugin, so return an error condition
        error('Invalid value for minutes argument');
        return;
    }

    success('getNextAppointment success');
}

if(!window.plugins)
    window.plugins = {};

if (!window.plugins.KountExample)
    window.plugins.KountExample = new KountExample();

if (typeof module != 'undefined' && module.exports)
    module.exports = KountExample;

