package com.mkaoudis.pebble;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.*;

import com.getpebble.android.kit.*;
import com.getpebble.android.kit.util.*;

import java.util.UUID;

public class Pebble extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext cb) throws JSONException {

		Context context=this.cordova.getActivity().getApplicationContext();

		if (action.equals("isWatchConnected")){
            cb.success(PebbleKit.isWatchConnected(context) ? 1 : 0);
            return true;
        }

        //if no action found
        return false;
	}
}