var exec = require('cordova/exec'),

    genericError = function(err){ console.error(err); };,
	Pebble = function() {
};

Pebble.isWatchConnected = function(success, error){
	if (!success) return console.error('success callback is required');
	cordova.exec(success, error || genericError, 'Pebble', 'isWatchConnected', []);
};

module.exports = Pebble;