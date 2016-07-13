package co.khanal.servicedemo;

import android.app.IntentService;
import android.content.Intent;

import java.util.Locale;

/**
 * Created by abhi on 7/12/16.
 */
public class SleepService extends IntentService {

    public static String KEY = "co.khanal.sleepservice";
    public static String DATA_KEY = "data_key";

    public SleepService(){
        super("SleepService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            Thread.sleep(4000);
            String msg = intent.getStringExtra(KEY);
            String message = String.format(Locale.US, "Message echo from service is: %s!", msg);

            Intent broadcast = new Intent();
            broadcast.setAction(MainActivity.ResponseReceiver.KEY);
            broadcast.addCategory(Intent.CATEGORY_DEFAULT);
            broadcast.putExtra(KEY, message);
            sendBroadcast(broadcast);




        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
