var exec = require('cordova/exec');

var Pebble = function() {

};

Pebble.isWatchConnected = function(success, error){
	if (!success) return console.error('success callback is required');
	cordova.exec(success, error || genericError, 'Pebble', 'isWatchConnected', []);
};

module.exports = Pebble;